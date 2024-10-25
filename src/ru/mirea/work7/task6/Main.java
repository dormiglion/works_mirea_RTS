package ru.mirea.work7.task6;

public class Main {
    public static void main(String[] args) {
        ProcessStrings processor = new ProcessStrings();

        String original = "Привет!";
        String reversed = processor.reverse(original);
        System.out.println("Оригинал: " + original);
        System.out.println("Инвертированная строка: " + reversed); // Ожидается: !dlroW ,olleH

        int vowelCount = processor.countVowels(original);
        System.out.println("Количество гласных в '" + original + "': " + vowelCount); // Ожидается: 3
    }
}
