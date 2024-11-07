package ru.mirea.work11.task4;

import java.util.Calendar;
import java.util.Scanner;

public class DateCreator {
    public static void createDateFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1; // В Calendar январь - это 0

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите час: ");
        int hour = scanner.nextInt();

        System.out.print("Введите минуту: ");
        int minute = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);

        System.out.println("Ваша дата: " + calendar.getTime());
    }

    public static void main(String[] args) {
        createDateFromInput();
    }
}
