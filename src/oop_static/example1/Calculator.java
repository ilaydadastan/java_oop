package oop_static.example1;


public class Calculator {
    private static final float pi = 3.14f;
    private int operationCount = 0;

    public void sum(float num1, float num2) {
        float result = num1 + num2;
        operationCount++;
        System.out.println(result);
    }

    public void subtract(float num1, float num2) {
        float result = num1 - num2;
        operationCount++;
        System.out.println(result);
    }

    public void divide(float num1, float num2) {
        float result = num1 / num2;
        operationCount++;
        System.out.println(result);
    }

    public void multiply(float num1, float num2) {
        float result = num1 * num2;
        operationCount++;
        System.out.println(result);
    }

    public void calculateCircleArea(float r) {
        float result = pi * r * r;
        operationCount++;
        System.out.println(result);
    }

    public void printOperationCount() {
        System.out.println(operationCount);
    }

}
