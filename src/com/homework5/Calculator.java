package com.homework5;

public class Calculator {
    int a;
    int b;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

    public int multiply(){
        return a * b;
    }

    public double divide(){
        return (double)a / b;
    }


}