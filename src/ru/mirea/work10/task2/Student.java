package ru.mirea.work10.task2;

public class Student {
    private String firstName;  // Имя
    private String lastName;   // Фамилия
    private String major;      // Специальность
    private double gpa;        // Итоговый балл

    public Student(String firstName, String lastName, String major, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + major + ", GPA: " + gpa + ")";
    }
}
