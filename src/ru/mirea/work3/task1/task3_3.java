package ru.mirea.work3.task1;
import java.util.Random;

public class task3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 + random.nextInt(90);
        }

        System.out.print("Сгенерированный массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isAscending = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

