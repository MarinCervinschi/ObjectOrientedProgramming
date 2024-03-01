public class InterestRate {
    public static void interestRate() {
        double y1 = 1000 + (1000 * 0.05);
        System.out.println("The initial balance is 1000€");
        System.out.println("After a year the balance with 5% of interest is " + y1);
        y1 += y1 * 0.05;
        System.out.println("After two years the balance with 5% of interest is " + y1);
        y1 += y1 * 0.05;
        System.out.println("After the third years the balance with 5% of interest is " + y1);
    }
}
