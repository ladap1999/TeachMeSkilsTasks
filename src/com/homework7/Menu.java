package com.homework7;

import java.util.Scanner;

public class Menu {
    static double[] memory = new double[3];
    static int point = 0;

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
                    printArray(memory);
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
                double rez1 = sum.action(a, b);
                fillingMemory(rez1);
                break;
            case "-":
                double rez2 = minus.action(a, b);
                fillingMemory(rez2);
                break;
            case "*":
                double rez3 = multiple.action(a, b);
                fillingMemory(rez3);
                break;
            case "/":
                double rez4 = div.action(a, b);
                fillingMemory(rez4);
                break;
            default:
                System.out.println(" The operation can not be processed. Try to enter '+','-','*','/'");
                throw new IllegalArgumentException();
        }
    }

    private void fillingMemory(double num) {
        for (; point < memory.length; ) {
            memory[point] = num;
            point++;
            break;
        }

        if (point == memory.length) {
            point = 0;
        }
    }

    private void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + "  ");
        }
    }
}
