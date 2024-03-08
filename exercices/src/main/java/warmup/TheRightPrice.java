package warmup;

import java.util.random.RandomGenerator;
import java.util.Scanner;
public class TheRightPrice {
    public static void theRightPrice() {
        RandomGenerator rnd = RandomGenerator.getDefault();
        int price = rnd.nextInt(0, 100);
        System.out.println("User1: insert your number...[0, 100]");
        Scanner sc1 = new Scanner(System.in);
        int i1 = sc1.nextInt();
        System.out.println("User2: insert your number...[0, 100]");
        Scanner sc2 = new Scanner(System.in);
        int i2 = sc2.nextInt();
        int g1 = Math.abs(i1 - price);
        int g2 = Math.abs(i2 - price);
        if (g1 > g2) {
            System.out.println("Price is " + price +" User2 wins!!!");
        } else if (g1 == g2){
            System.out.println("Price is " + price +" Both users win!!!");
        } else {
            System.out.println("Price is " + price +" User1 wins!!!");
        }
    }

    public static void main(String[] args) {
        theRightPrice();
    }
}
