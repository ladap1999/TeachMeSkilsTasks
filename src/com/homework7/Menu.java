package com.homework7;

import java.util.Scanner;

public class Menu {
    public void work() {
        double firstNumber;
        double secondNumber;
        int i = 0;

        while (i < 1) {
            System.out.println("Welcome to Calculator.Please choose option 1(calculate mathematical operation) or 2(exit): ");
            try {
                String option = enterString();
                if (option.equals("1")) {
                    System.out.println("Option 1:\n Enter the first number: ");
                    firstNumber = enterNumber();
                    System.out.println("Ok.:\n Enter the second number: ");
                    secondNumber = enterNumber();
                    System.out.println("Super!:\n Now, enter the mathematical operation:  ");
                    selectOperation(firstNumber, secondNumber);
                    System.out.println("Continue working: ");
                } else if (option.equals("2")) {
                    i++;
                    System.out.println("Will be glad to see you again. Bye!");
                } else {
                    System.out.println("This option can not be processed. Try to enter 1 or 2.");
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.fillInStackTrace());
            }
        }
    }

    private double enterNumber() {
        double a = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        } else {
            System.out.println("Try to use double value");
            throw new IllegalArgumentException();
        }
        return a;
    }

    private String enterString() {
        String a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        return a;
    }

    private void selectOperation(double a, double b) {
        Addition sum = new Addition();
        Subtraction minus = new Subtraction();
        Multiplication multiple = new Multiplication();
        Division div = new Division();
        switch (enterString()) {
            case "+":
                sum.action(a, b);
                break;
            case "-":
                minus.action(a, b);
                break;
            case "*":
                multiple.action(a, b);
                break;
            case "/":
                div.action(a, b);
                break;
            default:
                System.out.println(" The operation can not be processed. Try to enter '+','-','*','/'");
                throw new IllegalArgumentException();
        }
    }
}
