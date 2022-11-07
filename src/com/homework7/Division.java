package com.homework7;

public class Division implements Calculator {
    @Override
    public void action(double a, double b) {
        if (b != 0) {
            double division = a / b;
            System.out.println("The division is " + division);
        }else
            System.out.println("It is impossible divide by zero!");
    }
}
