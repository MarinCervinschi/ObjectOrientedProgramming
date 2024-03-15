package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0);
    }
    @Override
    public void transfer(BankAccount other, double amount) {
        String CountryCodeSrc = IBAN.substring(0, 2);
        String CountryCodeDst = other.getIBAN().substring(0, 2);
        if (!CountryCodeSrc.equals(CountryCodeDst)) {
            throw new IllegalArgumentException("International transfers invalid");
        }
        double allowedAmount = Math.min(amount, getBalance());
        super.withdraw(allowedAmount);
        other.deposit(allowedAmount);
    }
    @Override
    public void withdraw(double amount) {
        double allowedAmount = Math.min(amount, getBalance());
        super.withdraw(allowedAmount);
    }
}
