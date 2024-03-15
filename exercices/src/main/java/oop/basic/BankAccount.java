package oop.basic;

/**
 * A class representing a bank account.
 */
public class BankAccount {
    private double balance;

    /**
     * Creating an empty account.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Creating an account with the specified balance.
     * @param balance the specified balance.
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Getting the current balance.
     * @return current balance.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Depositing the specific amount into the account.
     * @param amount double representing the amount of money to be deposited.
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**
     * Withdrawing the specified amount from the account.
     * @param amount double representing the withdrawal
     */
    public void withdraw(double amount) {
        balance -= amount;
    }
}
