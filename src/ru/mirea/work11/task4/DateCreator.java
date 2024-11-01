package ru.mirea.work11.task4;

import java.util.Calendar;
import java.util.Scanner;

public class DateCreator {
    public static void createDateFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1; // В Calendar январь - это 0

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();

        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);

        System.out.println("Created date: " + calendar.getTime());
    }

    public static void main(String[] args) {
        createDateFromInput();
    }
}
