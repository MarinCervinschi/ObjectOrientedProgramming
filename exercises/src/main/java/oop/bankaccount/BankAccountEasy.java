package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0);
    }

    @Override
    public double withdraw(double amount) {
        double out = Math.min(amount, balance);
        return super.withdraw(out);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        String src = IBAN.substring(0, 2);
        String dst = other.getIBAN().substring(0, 2);
        if (!src.equals(dst)) {
            throw new IllegalArgumentException("Not good");
        }
        double out = withdraw(amount);
        other.deposit(out);
        return out;

    }
}
