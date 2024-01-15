package oop_interface.example1;

public class Main {
    public static void main(String[] args) {
        Vehicle truck1 = new Truck();
        Vehicle car1 = new Car();
        Vehicle motorcycle1 = new Motorcycle();
        System.out.println(car1.getFuelEfficiency());
        System.out.println(car1.calculateDistanceTraveled());
        System.out.println(truck1.getFuelEfficiency());
        System.out.println(truck1.calculateDistanceTraveled());
        System.out.println(motorcycle1.getFuelEfficiency());
        System.out.println(motorcycle1.calculateDistanceTraveled());

    }
}
