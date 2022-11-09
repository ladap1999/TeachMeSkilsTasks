package com.homework7;

public class Addition implements Calculator {
    @Override
    public double action(double a, double b) {
        double sum = a + b;
        System.out.println("The sum is " + sum);
        return sum;
    }
}
