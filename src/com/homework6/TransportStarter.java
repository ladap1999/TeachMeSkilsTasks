package com.homework6;

import java.util.Scanner;

public class TransportStarter {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        MilitaryTransport tank = new MilitaryTransport(10, 100, 200, "t34", 0, 0, true, 2);
        tank.printInfo();

        PassengerTransport car = new PassengerTransport(10, 250, 1000, "KIA", 4, 7.3, "universal", 4);
        car.printInfo();

        System.out.println("Enter desired time: ");
        car.calcWay(n.nextInt());

        FreightTransport trunk = new FreightTransport(10, 100, 15000, "MAZ", 6, 15, 5000);
        trunk.printInfo();
        trunk.isPossibleToTransport(5600);

        CivilTransport plane1 = new CivilTransport(300, 500, 160000, "Boing", 4, 10, 100, false);
        plane1.printInfo();
        plane1.isPossibleToTransport(15);

        MilitaryTransport plane2 = new MilitaryTransport(500, 650, 200000, "Boing", 6, 7, false, 0);
        plane2.printInfo();
        plane2.shoot();
        plane2.catapult();
    }
}
