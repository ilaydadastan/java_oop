package oop_abstract.example1;

abstract class Employee {
    String firstName;
    String lastName;
    String email;
    int age;
    float workingHours;
    float hourlyWage;
    public Employee(String firstName, String lastName, String email, int age, float workingHours, float hourlyWage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    public abstract float calculateSalary();
    public abstract String getTitle();

    public void displayInfo() {
        System.out.println(getTitle());
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Overtime Wage: " + calculateOvertimeWage());
        System.out.println();
    }

    public float calculateOvertimeWage(){
        return (workingHours * hourlyWage) - (40 * hourlyWage);
    }
}
