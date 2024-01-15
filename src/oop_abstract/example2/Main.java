package oop_abstract.example2;

public class Main {
    public static void main(String[] args) {
        BankAccount savingAccount1 = new SavingsAccount("ilayda", 123456, 70000f);
        BankAccount currentAccount1 = new CurrentAccount("ilayda1", 6574893, 55000f);
        System.out.println(savingAccount1.deposit(100f));
        System.out.println(savingAccount1.withdraw(5f));
        System.out.println(currentAccount1.deposit(3000f));
        System.out.println(currentAccount1.withdraw(400f));
    }
}
