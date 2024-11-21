package ru.mirea.work14.task1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для манипуляции:");
        String input = scanner.nextLine();

        while (true) {
            System.out.println("\nВведите регулярное выражение для разбиения строки:");
            String regex = scanner.nextLine();

            try {
                Pattern.compile(regex);
                String[] parts = input.split(regex);

                System.out.println("\nРезультат разбиения строки:");
                for (int i = 0; i < parts.length; i++) {
                    System.out.println("Элемент " + (i + 1) + ": " + parts[i]);
                }
                break;
            } catch (PatternSyntaxException e) {
                System.out.println("Ошибка: некорректное регулярное выражение. Попробуйте снова.");
            }
        }
        scanner.close();
    }
}