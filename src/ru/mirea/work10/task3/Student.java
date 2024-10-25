package ru.mirea.work10.task3;

public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private double gpa;

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
