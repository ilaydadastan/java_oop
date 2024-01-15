package oop_abstract.example2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountName, int accountNumber, float balance) {
        super(accountName, accountNumber, balance);
    }

    @Override
    public float deposit(float amountToAdd){
        balance = balance + amountToAdd + (amountToAdd * 0.03f);
        return balance;
    }

    @Override
    public float withdraw(float amountToWithdraw) {
        balance = balance - amountToWithdraw - (amountToWithdraw * 0.03f );
        return balance;
    }
}
