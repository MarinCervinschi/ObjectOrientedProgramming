package oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount{
    protected String IBAN;
    protected double balance;
    protected double interestRate;
    protected double operationFee;
    public AbstractBankAccount(String IBAN, double balance, double interestRate, double operationFee) {
        setIBAN(IBAN);
        setBalance(balance);
        setInterestRate(interestRate);
        setOperationFee(operationFee);
    }

    @Override
    public void addInterest() {
        setBalance(getBalance() * getInterestRate());
    }

    protected void applyFee() {
        setBalance(getBalance() + getOperationFee());
    }
    protected void checkIBAN(String IBAN) {
        return;
    }
    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        this.operationFee = operationFee;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }
    @Override
    public double withdraw(double amount) {
        setBalance(getBalance() - amount);
        return amount;
    }
}
