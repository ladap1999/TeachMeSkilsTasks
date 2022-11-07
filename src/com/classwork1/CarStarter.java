package com.classwork1;

public class CarStarter {
    public static void main(String[] args) {
        Car car1 = new Car("Skoda", 250, 23500);
        try {
            car1.startWorking();

            Car car2 = new Car("KIA", 220, 20000);
            car2.startWorking();

            Car car3 = new Car("BMW", 300, 43000);
            car3.startWorking();
        } catch (CarException e) {
            System.out.println("Yhhhu! We caught you!");
        }
    }
}
