package com.homework7;

public class Subtraction implements Calculator {
    @Override
    public double action(double a, double b) {
        double subtraction = a - b;
        System.out.println("The subtraction is " + subtraction);
        return subtraction;
    }
}
