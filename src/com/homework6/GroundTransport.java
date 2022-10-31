package com.homework6;

public class GroundTransport extends Transport {
    private int amountOfWheels;
    private double fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int amountOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                " amountOfWheels = " + amountOfWheels +
                ", fuelConsumption = " + fuelConsumption +
                ", ";
    }
}
