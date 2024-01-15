package oop_abstract.example1;

public class Manager extends Employee {

    public Manager(String firstName, String lastName, String email, int age , float workingHours, float hourlyWage) {
        super(firstName, lastName, email, age, workingHours, hourlyWage);
    }

    @Override
    public float calculateSalary() {
        return workingHours * hourlyWage;
    }

    @Override
    public String getTitle() {
        return "Manager";
    }


}
