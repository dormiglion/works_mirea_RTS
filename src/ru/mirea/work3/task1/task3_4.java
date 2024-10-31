package ru.mirea.work3.task1;
import java.util.Scanner;
import java.util.Random;

public class task3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = 0;
        do {
            System.out.print("Введите размер массива (натуральное число больше 1): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: необходимо ввести натуральное число больше 1.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 1);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 1);
        }

        System.out.print("Первый массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount > 0) {
            int[] evenArray = new int[evenCount];
            int index = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    evenArray[index] = num;
                    index++;
                }
            }

            System.out.print("Второй массив (четные элементы): ");
            for (int num : evenArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("В первом массиве нет четных элементов.");
        }
    }
}

