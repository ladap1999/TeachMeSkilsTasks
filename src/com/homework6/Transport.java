package com.homework6;

public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "power in horsepower = " + power +
                ", maxSpeed = " + maxSpeed +
                ", weight = " + weight +
                ", brand = " + brand + ",";
    }

    public double convertPowerToWat(int power) {
        return power * 0.74;
    }
}


