package com.homework6;

public class MilitaryTransport extends AirTransport {
    private boolean isSystemOfEjection;
    private int amountOfRockets;

    public MilitaryTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthOfRunway, boolean isSystemOfEjection, int amountOfRockets) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthOfRunway);
        this.isSystemOfEjection = isSystemOfEjection;
        this.amountOfRockets = amountOfRockets;
    }

    public boolean getSystemOfEjection() {
        return isSystemOfEjection;
    }

    public int getAmountOfRockets() {
        return amountOfRockets;
    }

    @Override
    public String toString() {
        return "MilitaryTransport: " + super.toString()
                + " isSystemOfEjection = " + isSystemOfEjection +
                ", amountOfRockets = " + amountOfRockets +
                ", ";
    }

    public void printInfo() {
        double powerInKV = this.convertPowerToWat(this.getPower());
        System.out.println(this.toString() + " power in kV = " + powerInKV);
    }

    public void shoot() {
        if (getAmountOfRockets() != 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (getSystemOfEjection()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
