package oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount {
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1, 0.02);
    }

    @Override
    public double withdraw(double amount) {
        double out = super.withdraw(amount);
        applyFee();
        return out;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applyFee();
    }
}
