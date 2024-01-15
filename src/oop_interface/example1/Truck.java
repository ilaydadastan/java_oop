package oop_interface.example1;

import java.time.LocalDate;

public class Truck implements Vehicle{

    private String model;
    private static final int year = 2015;
    private static final float fuelEfficiency = 6.5f;


    @Override
    public float getFuelEfficiency() {
        return fuelEfficiency * 1;
    }
    private static int getCurrentYear() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    @Override
    public float calculateDistanceTraveled() {
        int currentYear = getCurrentYear();
        return (currentYear - year)* 25000;
    }
}
