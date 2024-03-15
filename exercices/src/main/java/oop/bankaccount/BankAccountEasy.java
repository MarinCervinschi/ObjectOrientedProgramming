package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0);
    }
    public double transfer(BankAccount other, double amount) {
        applyFee();
        super.withdraw(amount);
        other.deposit(amount);
        return amount;
    }
    public double withdraw(double amount) {
        double allowedAmount = Math.min(amount, getBalance());
        return super.withdraw(allowedAmount);
    }
}
