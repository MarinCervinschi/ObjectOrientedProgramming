package oop.bankaccount;

public interface BankAccount {
    public void addInterest();
    public void deposit(double amount);
    public double getBalance();
    public String getIBAN();
    public double getInterestRate();
    public double getOperationFee();
    public void setBalance(double balance);
    public void setIBAN(String iban);
    public void setInterestRate(double interestRate);
    public void setOperationFee(double fee);
    public double transfer(BankAccount bankAccount, double amount);
    public double withdraw(double amount);
}
