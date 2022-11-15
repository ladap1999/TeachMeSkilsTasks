package com.homework9;

import java.util.ArrayList;

public class University {
    private String nameOfUniversity;
    private ArrayList<Student> listOfStudents;
    private double rate;

    public University(String nameOfUniversity, ArrayList<Student> listOfStudents) {
        this.nameOfUniversity = nameOfUniversity;
        this.listOfStudents = listOfStudents;
        this.setRate(countRate(listOfStudents));
    }

    public void removeStudent(ArrayList<Student> students, int elementForRemoving) {
        students.remove(elementForRemoving);
    }

    public void addStudent(ArrayList<Student> students, Student student, int positionForAdding) {
        students.add(positionForAdding, student);
    }

    public void searchStudentByName(ArrayList<Student> students, String name) {
        for (Student element : students) {
            if (element.getName().equals(name)) {
                System.out.println("We have such student: " + element.toString());
            }
        }
    }

    public double countRate(ArrayList<Student> students) {
        double rate = 0;
        int sum = 0;
        int count = 0;

        for (Student element : students) {
            for (Integer num : element.getMarks()) {
                sum += num;
                count++;
            }
        }
        try {
            rate = (double) sum / count;
        } catch (ArithmeticException e) {
            System.out.println("count = 0, You can't divide by zero");
        }
        return rate;
    }

    public void printObject(){
        System.out.println(this.toString());
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", listOfStudents=" + listOfStudents +
                ", rate=" + rate +
                '}';
    }
}
