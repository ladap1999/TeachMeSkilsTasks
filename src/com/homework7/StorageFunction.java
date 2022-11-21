package com.homework7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFunction implements MemoryStorage {
    private double[] memory = new double[3];
    private ArrayList<Double> resultAfterAction = new ArrayList<>();
    private HashMap<String, ArrayList<Double>> storageForAction = new HashMap<>();
    {
        storageForAction.put("+", new ArrayList<>());
        storageForAction.put("-", new ArrayList<>());
        storageForAction.put("*", new ArrayList<>());
        storageForAction.put("/", new ArrayList<>());
    }

    static int point = 0;

    public double[] getMemory() {
        return memory;
    }

    public ArrayList<Double> getResultAfterAction() {
        return resultAfterAction;
    }

    public HashMap<String, ArrayList<Double>> getStorageForAction() {
        return storageForAction;
    }

    @Override
    public void fillingMemoryByArray(double num) {
        for (; point < memory.length; ) {
            memory[point] = num;
            point++;
            break;
        }

        if (point == memory.length) {
            point = 0;
        }
    }

    @Override
    public void fillingMemoryByCollection(double num) {
        resultAfterAction.add(num);
    }

    @Override
    public void fillingMemoryByMapCollection(String sign, double num) {
        for (Map.Entry<String, ArrayList<Double>> entry: storageForAction.entrySet()) {
            if (sign.equals(entry.getKey())){
               entry.getValue().add(num);
               }
            }
        }

    public static void printArray(double[] array) {
        System.out.println("История операций в массиве:");
        for (double element : array) {
            System.out.print(element + "  ");
        }
    }

    public static void printCollection(ArrayList<Double> collection) {
        System.out.println("\nИстория операций в коллекции:");
        for (double element : collection) {
            System.out.print(element + "  ");
        }
    }

    public static void printMapCollection(HashMap<String,ArrayList<Double>> mapCollection) {
        System.out.println("\nИстория операций в mapCollection:");
        for (Map.Entry<String, ArrayList<Double>> entry: mapCollection.entrySet()) {
            System.out.print(entry.getKey() + " (");
            for (Double element: entry.getValue()) {
                System.out.print(element + " ");
            }
            System.out.println(")");
        }
    }
}
