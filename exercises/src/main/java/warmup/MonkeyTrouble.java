package warmup;

import java.util.Scanner;
public class MonkeyTrouble {
    public static void monkeyTrouble() {
        System.out.println("Is the monkey A smiling? 'Y/N'");
        Scanner sc1 = new Scanner(System.in);
        String i1 = sc1.next();
        System.out.println("Is the monkey B smiling? 'Y/N'");
        Scanner sc2 = new Scanner(System.in);
        String i2 = sc2.next();
        if (((i1.equals("Y") || i1.equals("y")) && (i2.equals("Y") || i2.equals("y")) ||
                ((i1.equals("N") || i1.equals("n")) && (i2.equals("N") || i2.equals("n")) ) ) ){
            System.out.println("We are in trouble!!!");
        }else {
            System.out.println("We are fine :))");
        }
    }

    public static void main(String[] args) {
        monkeyTrouble();
    }
}
