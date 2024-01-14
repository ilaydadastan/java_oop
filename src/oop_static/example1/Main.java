package oop_static.example1;


public class Main {
    public static void main(String[] args) {

        Calculator cal1 = new Calculator();

        cal1.sum(2, 4);
        cal1.sum(2, 9);
        cal1.subtract(3, 6);
        cal1.divide(12, 4);
        cal1.multiply(12, 14);
        cal1.calculateCircleArea(6);
        cal1.printOperationCount();
        cal1.sum(3, 7);
        cal1.printOperationCount();

        Calculator cal2 = new Calculator();
        cal2.multiply(3, 8);
        cal2.printOperationCount();


        Calculator cal3 = new Calculator();
        cal3.printOperationCount();

    }
}