package com.homework8;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        String result = createString();

        System.out.println("The last symbol is " + result.charAt(result.length() - 1));
        System.out.println("The string finished with !!!? " + result.endsWith("!!!"));
        System.out.println("The string started with !!!? " + result.startsWith("I like"));
        System.out.println("The string contains Java? " + result.contains("Java"));
        System.out.println("The position of Java is? " + result.indexOf("Java"));
        System.out.println("The string is " + result.replace("a", "o"));
        System.out.println("The string is " + result.toUpperCase());
        System.out.println("The string is " + result.toLowerCase());
        System.out.println("The string is " + result.substring(7, 11));

        foundPalindrom(result);
        determineCertainLength(result);
        searchMinLengthStrings(result);
        searchMaxLengthStrings(result);

        sumSomeStrings();
        subtractionSomeStrings();
        multiplicationSomeStrings();
        enterWords();
    }

    private static String createString() {
        return "I like Java!!!";
    }

    private static String foundPalindrom(String s) {

        String[] arrayOfStrings = formArray(s);

        for (String element : arrayOfStrings) {
            StringBuilder sbString = new StringBuilder(element);
            StringBuilder transformedString = sbString.reverse();
            if (element.equals(transformedString.toString())) {
                System.out.println("We found palindrome " + element);
            } else
                System.out.println("This word " + element + " not a palindrome");
        }
        return s;
    }

    private static void determineCertainLength(String s) {
        String[] arrayOfStrings = formArray(s);
        int[] lengths = new int[arrayOfStrings.length];

        for (int i = 0; i < arrayOfStrings.length; i++) {
            lengths[i] = arrayOfStrings[i].length();
        }

        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] >= 3 && lengths[i] <= 5) {
                System.out.print(arrayOfStrings[i] + " ");
            }
        }
    }

    private static void searchMinLengthStrings(String s) {
        String[] arrayOfStrings = formArray(s);
        int[] lengths = new int[arrayOfStrings.length];
        int minNumber = lengths[0];
        int minIndex = 0;

        for (int i = 0; i < arrayOfStrings.length; i++) {
            lengths[i] = arrayOfStrings[i].length();
        }

        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] < minNumber) {
                minNumber = lengths[i];
                minIndex = i;
            }
        }
        System.out.println("\n" + arrayOfStrings[minIndex]);
    }

    private static void searchMaxLengthStrings(String s) {
        String[] arrayOfStrings = formArray(s);
        int[] lengths = new int[arrayOfStrings.length];
        int maxNumber = lengths[0];
        int maxIndex = 0;
        for (int i = 0; i < arrayOfStrings.length; i++) {
            lengths[i] = arrayOfStrings[i].length();
        }
        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] >= maxNumber) {
                maxNumber = lengths[i];
                maxIndex = i;
            }
        }
        System.out.println(arrayOfStrings[maxIndex]);
    }

    private static String[] formArray(String s) {
        return s.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "").split(" ");
    }

    private static void sumSomeStrings() {
        int thirdResult = 3 + 56;
        concatStrings(new StringBuilder("3 + 56 = "), thirdResult);
    }

    private static void subtractionSomeStrings() {
        int thirdResult = 3 - 56;
        concatStrings(new StringBuilder("3 - 56 = "), thirdResult);
    }

    private static void multiplicationSomeStrings() {
        int thirdResult = 3 * 56;
        concatStrings(new StringBuilder("3 * 56 = "), thirdResult);
    }

    private static void concatStrings(StringBuilder s, int a) {
        System.out.println(s.append(a));
    }

    private static void enterWords() {
        Scanner scanner = new Scanner(System.in);
        try {
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            if (firstString.length() % 2 == 0 && secondString.length() % 2 == 0) {
                String result = firstString.substring(0, firstString.length() / 2) + secondString.substring(secondString.length() / 2, secondString.length() / 1);
                System.out.println(result);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Try to enter word with correct amount of letters");
        }
    }
}
