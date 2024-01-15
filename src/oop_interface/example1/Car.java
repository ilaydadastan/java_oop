package oop_interface.example1;

import java.time.LocalDate;

public class Car implements Vehicle {

    public String model;
    public static final int year = 2022;
    private static final float fuelEfficiency = 8.5f;

    @Override
    public float getFuelEfficiency() {
        return fuelEfficiency * 3;

    }

    public static int getCurrentYear() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    @Override
    public float calculateDistanceTraveled() {
        int currentYear = getCurrentYear();
        return (currentYear - year) * 15000;
    }

}
