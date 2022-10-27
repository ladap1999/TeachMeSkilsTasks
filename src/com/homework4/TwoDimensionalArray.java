package com.homework4;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int[][] array = new int[num][num];

        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + "     ");
            }
        }
        System.out.println(" ");

//      task1(array);
//      task2(array);
//      task3(array);
//      task4(array);
        task5(array);
    }

    public static void task1(int[][] array) {
        int sum = 0;
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (array[i][j] % 2 == 0) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of even numbers = " + sum);
    }

    public static void task2(int[][] array) {
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (array[i][j] % 2 != 0) {
                System.out.print(array[i][j] + "  ");
            }
        }
    }

    public static void task3(int[][] array) {
        int multi1 = 1;
        int multi2 = 1;
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            multi1 *= array[i][j];
        }
        System.out.println(multi1);

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            multi2 *= array[i][j];
        }
        System.out.println(multi2);

        if (multi1 > multi2) {
            System.out.println("main line is bigger then addition");
        } else if (multi2 > multi1) {
            System.out.println("addition line is bigger then main");
        } else
            System.out.println(" they are equal");
    }

    public static void task4(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                System.out.println(array[i][j]);
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("The sum is " + sum);
    }

    public static void task5(int[][] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("------------------------");
        for (int[] elements : array) {
            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(elements[j] + "   ");
            }
        }
    }
}
