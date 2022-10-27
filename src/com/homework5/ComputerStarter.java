package com.homework5;

import java.util.Scanner;

public class ComputerStarter {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int toggle = n.nextInt();

        Computer comp1 = new Computer("Intel core i7", 16, 8, 30000);
        comp1.printOptions();

        if (toggle == 0 || toggle == 1) {
            comp1.switchOn(toggle);
            if (comp1.isAlive) {
                comp1.switchOff(toggle);
            }
        } else {
            System.out.println("System doesn't work. Try to print 1 or 0!");
        }

        if (comp1.cycle >= comp1.lifetime) {
            System.out.println("The computer was broken, you can trow away it and find new one.");
        }
    }
}
