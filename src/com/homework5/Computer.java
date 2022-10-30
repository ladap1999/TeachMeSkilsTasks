package com.homework5;

import java.util.Random;

public class Computer {
    String cpu;
    int ram;
    int hdd;
    int lifetime;
    int cycle = 0;
    boolean isAlive;

    public Computer() {
    }

    public Computer(String cpu, int ram, int hdd, int lifetime) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", lifetime=" + lifetime +
                '}';
    }

    public void printOptions(){
        System.out.println(this.toString());
    }

    public void switchOn(int toggle1){
        Random random = new Random();
        int resultOfSwitching = random.nextInt(2);
        System.out.println(resultOfSwitching);
        if (toggle1 == resultOfSwitching){
            System.out.println("The computer was switched on!");
            isAlive = true;
            cycle++;
        }else {
            System.out.println("The computer was broken!");
            isAlive = false;
        }
    }

    public void switchOff(int toggle2){
        Random random = new Random();
        int resultOfSwitching = random.nextInt(1);
        if (toggle2 == resultOfSwitching){
            System.out.println("The computer was switched off!");
            cycle++;
        }else {
            System.out.println("The computer was broken!");
        }
    }
}
