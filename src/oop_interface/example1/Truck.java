package oop_interface.example1;

import java.time.LocalDate;

public class Truck implements Vehicle{

    public String model;
    public static final int year = 2015;
    public static final float fuelEfficiency = 6.5f;


    @Override
    public float getFuelEfficiency() {
        return fuelEfficiency * 1;
    }
    public static int getCurrentYear() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    @Override
    public float calculateDistanceTraveled() {
        int currentYear = getCurrentYear();
        return (currentYear - year)* 25000;
    }
}
