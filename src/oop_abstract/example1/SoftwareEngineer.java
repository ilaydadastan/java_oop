package oop_abstract.example1;

public class SoftwareEngineer extends Employee {

    public SoftwareEngineer(String firstName, String lastName, String email, int age, float workingHours, float hourlyWage) {
        super(firstName, lastName, email, age, workingHours, hourlyWage);
    }

    @Override
    public float calculateSalary() {
        return 1.5f * workingHours * hourlyWage;
    }

    @Override
    public String getTitle() {
        return "Software Engineer";
    }

}
