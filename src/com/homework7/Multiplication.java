package com.homework7;

public class Multiplication implements Calculator {
    @Override
    public double action(double a, double b) {
        double multiplication = a * b;
        System.out.println("The multiplication is " + multiplication);
        return multiplication;
    }
}
