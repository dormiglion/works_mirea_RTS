package ru.mirea.work11.task3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getFormat(String formatType) {
        int dateFormatStyle;

        switch (formatType.toLowerCase()) {
            case "short":
                dateFormatStyle = DateFormat.SHORT;
                break;
            case "medium":
                dateFormatStyle = DateFormat.MEDIUM;
                break;
            case "long":
                dateFormatStyle = DateFormat.LONG;
                break;
            default:
                System.out.println("Тип формата неизвестен. Используется формат по умолчанию (medium).");
                dateFormatStyle = DateFormat.MEDIUM;
        }
        DateFormat dateFormat = DateFormat.getDateInstance(dateFormatStyle);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: '" + name + "', дата рождения: " + getFormat("medium") + '}';
    }

    public static void main(String[] args) {
        Date birthDate = new Date(105, 7, 21); // Пример даты рождения
        Student student = new Student("Софья", birthDate);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите формат вывода даты (short, medium, long): ");
        String formatType = scanner.nextLine();

        // Вывод даты рождения в выбранном формате
        System.out.println("Дата рождения в выбранном формате: " + student.getFormat(formatType));
        System.out.println(student);
        scanner.close();
    }

}
