package com.homework6;

public class AirTransport extends Transport {
    private int wingspan;
    private int minLengthOfRunway;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthOfRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthOfRunway = minLengthOfRunway;
    }

    @Override
    public String toString() {
        return super.toString() +
                " wingspan = " + wingspan +
                ", minLengthOfRunway = " + minLengthOfRunway +
                ", ";
    }
}
