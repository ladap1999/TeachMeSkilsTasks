package com.homework6;

public class FreightTransport extends GroundTransport {
    private int loadCapacity;

    public FreightTransport(int power, int maxSpeed, int weight, String brand, int amountOfWheels, double fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "FreightTransport: " + super.toString() +
                " loadCapacity = " + loadCapacity +
                ", ";
    }

    public void printInfo() {
        double powerInKV = this.convertPowerToWat(this.getPower());
        System.out.println(this.toString() + " power in kV = " + powerInKV);
    }

    public void isPossibleToTransport(int amountOfCargo) {
        if (amountOfCargo <= getLoadCapacity()) {
            System.out.println("Груз погружен");
        } else {
            System.out.println("Вам стоит поискать грузовик побольше");
        }
    }
}
