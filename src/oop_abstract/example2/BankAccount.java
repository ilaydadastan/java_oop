package oop_abstract.example2;

abstract class BankAccount {
    String accountName;
    int accountNumber;
    float balance;


    public BankAccount(String accountName, int accountNumber, float balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract float deposit(float amountToAdd);

    public abstract float withdraw(float amountToWithdraw);
}
