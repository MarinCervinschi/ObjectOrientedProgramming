package threads;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ProducerConsumerSafe {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> dq = new LinkedList<>();
        Thread producer = new ProducerSafe(dq);
        Thread consumer = new ConsumerSafe(dq);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }

    static class ProducerSafe extends Thread {
        final Deque<Integer> integerDeque;

        public ProducerSafe(Deque<Integer> deque) {
            super();
            this.integerDeque = deque;
        }

        @Override
        public void run() {
            int i = 0;
            while (!isInterrupted()) {
                synchronized (integerDeque) {
                    integerDeque.addFirst(i++);
                }
            }
        }
    }

    static class ConsumerSafe extends Thread {
        final Deque<Integer> integerDeque;

        public ConsumerSafe(Deque<Integer> deque) {
            super();
            this.integerDeque = deque;
        }

        @Override
        public void run() {
            int lastElement = 0;
            while (!isInterrupted()) {
                try {
                    synchronized (integerDeque){
                        lastElement = integerDeque.removeFirst();
                    }

                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.println("Total number of consumed elements: " + lastElement);
        }
    }
}
