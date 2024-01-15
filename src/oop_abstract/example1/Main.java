package oop_abstract.example1;

public class Main {

    public static void main(String[] args) {
        Employee manager = new Manager("ahmet can", "kepenek", "ahmetcan@gmail.com", 23, 50f, 405);
        Employee softwareEngineer = new SoftwareEngineer("ilayda", "dastan", "ilayda@gmail.com", 23, 60f, 40f);
        manager.displayInfo();
        softwareEngineer.displayInfo();
        Employee accountant = new Accountant("john", "doe", "john@gmail.com", 28, 55f, 25f);
        accountant.displayInfo();
    }
}
