package com.homework5;

public class CalculatorStarter {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(12,15);
        System.out.println("Sum = " + c1.sum());
        System.out.println("subtraction = " + c1.subtract());
        System.out.println("multiplication = " + c1.multiply());
        System.out.println("division = " + c1.divide());
    }
}
