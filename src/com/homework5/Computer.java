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

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (ram != computer.ram) return false;
        if (hdd != computer.hdd) return false;
        if (lifetime != computer.lifetime) return false;
        return cpu.equals(computer.cpu);
    }

    @Override
    public int hashCode() {
        int result = cpu.hashCode();
        result = 31 * result + ram;
        result = 31 * result + hdd;
        result = 31 * result + lifetime;
        return result;
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
