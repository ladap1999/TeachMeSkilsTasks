package com.homework6;

public class PassengerTransport extends GroundTransport {
    private String carcase;
    private int amountOfPassengers;

    public PassengerTransport(int power, int maxSpeed, int weight, String brand, int amountOfWheels, double fuelConsumption, String carcase, int amountOfPassengers) {
        super(power, maxSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.carcase = carcase;
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public String toString() {
        return "PassengerTransport: " + super.toString() +
                " carcase = " + carcase +
                ", amountOfPassengers = " + amountOfPassengers +
                ", ";
    }

    public void printInfo() {
        double powerInKV = this.convertPowerToWat(this.getPower());
        System.out.println(this.toString() + " power in kV = " + powerInKV);
    }

    public void calcWay(int time) {
        int allWay = time * getMaxSpeed();
        System.out.println("За время " + time + "ч, автомобиль " + getBrand() + " двигаясь со скоростью " +
                getMaxSpeed() + "км/ч проедет " + allWay + " км " + " израсходует " + calcFuel(allWay) +
                " литров топлива.");
    }

    private double calcFuel(int way) {
        return getFuelConsumption() / 100 * way;
    }
}
