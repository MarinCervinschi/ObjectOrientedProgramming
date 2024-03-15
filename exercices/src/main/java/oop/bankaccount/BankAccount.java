package oop.bankaccount;

public interface BankAccount {
    void addInterest();
    void deposit(double amount);
    double getBalance();
    String getIBAN();
    double getInterestRate();
    double getOperationFee();
    void setBalance(double balance);
    void setIBAN(String iban);
    void setInterestRate(double interestRate);
    void setOperationFee(double fee);
    void transfer(BankAccount bankAccount, double amount);
    void withdraw(double amount);
}
