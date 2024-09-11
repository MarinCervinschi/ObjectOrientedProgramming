package threads;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProducerConsumerUnsafe {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> dq = new ConcurrentLinkedDeque<>();
        Thread producer = new ProducerUnsafe(dq);
        Thread consumer = new ConsumerUnsafe(dq);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }

    static class ProducerUnsafe extends Thread {
        final Deque<Integer> integerDeque;

        public ProducerUnsafe(Deque<Integer> deque) {
            super();
            this.integerDeque = deque;
        }

        @Override
        public void run() {
            int i = 0;
            while (!isInterrupted()) {
                integerDeque.addFirst(i++);
            }
        }
    }

    static class ConsumerUnsafe extends Thread {
        final Deque<Integer> integerDeque;

        public ConsumerUnsafe(Deque<Integer> deque) {
            super();
            this.integerDeque = deque;
        }

        @Override
        public void run() {
            int lastElement = 0;
            while (!isInterrupted()) {
                try {
                    lastElement = integerDeque.removeFirst();
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.println("Total number of consumed elements: " + lastElement);
        }
    }
}
