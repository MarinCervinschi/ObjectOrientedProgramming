package warmup;

import java.util.random.RandomGenerator;
import java.util.Scanner;
public class GuessNumber {
    public static void guessNumber() {
        System.out.println("Guess a number between 0 and 3!!");
        while (true) {
            RandomGenerator rnd = RandomGenerator.getDefault();
            int number = rnd.nextInt(0,3);
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == number && number == 0) {
                System.out.println("Good job!! :))");
                return;
            } else {
                System.out.println("Retry!! :((");
            }
        }
    }

    public static void main(String[] args) {
        guessNumber();
    }
}
