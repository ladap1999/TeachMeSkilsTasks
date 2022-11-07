package com.classwork1;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private double price;

    public Car() {
    }

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void startWorking() throws CarException {
        Random random = new Random();
        int fortuneNumber = random.nextInt(21);
        System.out.println(fortuneNumber);

        if (fortuneNumber % 2 == 0) {
            throw new CarException("My exception");
        } else {
            System.out.println("Car " + getBrand() + " exists");
        }
    }
}
