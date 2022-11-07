package com.homework7;

public class Subtraction implements Calculator {
    @Override
    public void action(double a, double b) {
        double subtraction = a - b;
        System.out.println("The subtraction is " + subtraction);
    }
}
