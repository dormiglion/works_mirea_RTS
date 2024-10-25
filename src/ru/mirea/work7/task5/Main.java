package ru.mirea.work7.task5;

public class Main {
    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();
        String testString = "Пример строки для теста";

        System.out.println("Количество символов в строке: " + stringManipulator.countChars(testString));

        System.out.println("Символы на нечетных позициях: " + stringManipulator.getOddPositionChars(testString));

        System.out.println("Инвертированная строка: " + stringManipulator.reverseString(testString));
    }
}
