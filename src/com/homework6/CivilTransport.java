package com.homework6;

public class CivilTransport extends AirTransport {
    private int amountOfPassengers;
    private boolean isBusinessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthOfRunway, int amountOfPassengers, boolean isBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthOfRunway);
        this.amountOfPassengers = amountOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    @Override
    public String toString() {
        return "CivilTransport: " + super.toString() +
                " amountOfPassengers = " + amountOfPassengers +
                ", isBusinessClass=" + isBusinessClass +
                ", ";
    }

    public void printInfo() {
        double powerInKV = this.convertPowerToWat(this.getPower());
        System.out.println(this.toString() + " power in kV = " + powerInKV);
    }

    public void isPossibleToTransport(int amountOfPassengers) {
        if (amountOfPassengers <= getAmountOfPassengers()) {
            System.out.println("Пассажиры внутри");
        } else {
            System.out.println("Вам стоит поискать транспорт побольше");
        }
    }
}
