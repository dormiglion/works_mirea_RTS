package ru.mirea.work11.task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate(int dateFormatStyle) {
        DateFormat dateFormat = DateFormat.getDateInstance(dateFormatStyle);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', birthDate=" + getFormattedBirthDate(DateFormat.MEDIUM) + '}';
    }

    public static void main(String[] args) {
        Date birthDate = new Date(90, 6, 15); // Пример даты рождения
        Student student = new Student("John Doe", birthDate);
        System.out.println("Short format: " + student.getFormattedBirthDate(DateFormat.SHORT));
        System.out.println("Medium format: " + student.getFormattedBirthDate(DateFormat.MEDIUM));
        System.out.println("Long format: " + student.getFormattedBirthDate(DateFormat.LONG));
    }

}
