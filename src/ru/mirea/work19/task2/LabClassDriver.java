package ru.mirea.work19.task2;

import java.util.ArrayList;
import java.util.List;

public class LabClassDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 2);
        Student student2 = new Student("Sus", 5);
        Student student3 = new Student("Lena", 4.5);
        Student student4 = new Student("Artur", 3.2);
        Student student5 = new Student("Sonya", 4.9);
        Student student6 = new Student("Ann", 2.5);
        Student student7 = new Student("Ann", 4.1);
        ArrayList<Student> students = new ArrayList<>(
                List.of(new Student[]{
                        student1,
                        student2,
                        student3,
                        student4,
                        student5,
                        student6,
                        student7}
                ));
        LabClass labClass = new LabClass(students);
        LabClassUI ui = new LabClassUI(labClass);
        ui.start();
    }
}
