package oop.bankaccount;

public class AbstractBankAccount implements BankAccount {
    protected String IBAN;
    protected double balance;
    protected double operationFee;
    protected double interestRate;

    protected AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        setIBAN(IBAN);
        setOperationFee(operationFee);
    }

    public void checkPositiveValue(double value) {
        if (value < 0.0) {
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(double operationFee) {
        checkPositiveValue(operationFee);
        this.operationFee = operationFee;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void applyFee() {
        balance -= operationFee;
    }

    @Override
    public void addInterest() {
        balance += balance * interestRate;
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }

    @Override
    public double withdraw(double amount) {
        checkPositiveValue(amount);
        balance -= amount;
        return amount;
    }

    @Override
    public void deposit(double amount) {
        checkPositiveValue(amount);
        balance += amount;
    }
}
