package oop_interface.example1;

import java.time.LocalDate;

public class Motorcycle implements Vehicle {

    private String model;
    public static int year = 2017;
    private static final float fuelEfficiency = 7f;

    @Override
    public float getFuelEfficiency() {
        return fuelEfficiency * 2;
    }

    private static int getCurrentYear() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    @Override
    public float calculateDistanceTraveled() {
        int currentYear = getCurrentYear();
        return (currentYear - year) * 8000;
    }

}
