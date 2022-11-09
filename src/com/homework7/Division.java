package com.homework7;

public class Division implements Calculator {
    @Override
    public double action(double a, double b) {
        double division = 0;
        if (b != 0) {
            division = a / b;
            System.out.println("The division is " + division);
        } else {
            System.out.println("It is impossible divide by zero!");
        }
        return division;
    }
}
