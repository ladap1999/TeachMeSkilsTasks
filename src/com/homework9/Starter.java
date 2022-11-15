package com.homework9;

import java.util.ArrayList;
import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        Student firstStudent = new Student(17, "Tom", new ArrayList<>(Arrays.asList(5, 9, 8)));
        Student secondStudent = new Student(18, "Alice", new ArrayList<>(Arrays.asList(9, 10, 8)));
        Student thirdStudent = new Student(19, "Karl", new ArrayList<>(Arrays.asList(4, 6, 7)));
        Student fourthStudent = new Student(19, "Glory", new ArrayList<>(Arrays.asList(8, 7, 8)));

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(firstStudent, secondStudent, thirdStudent, fourthStudent));

        University bsuir = new University("BSUIR", students);
        bsuir.printObject();

        bsuir.searchStudentByName(students, "Karl");

        bsuir.removeStudent(students, 2);
        bsuir.addStudent(students, new Student(19, "Sofa", new ArrayList<>(Arrays.asList(10, 9, 10))), 1);
        bsuir.setRate(bsuir.countRate(students));

        bsuir.printObject();
    }
}
