package ru.mirea.work8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Введите натуральное число n (n > 1): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: необходимо ввести натуральное число больше 1.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 1);

        System.out.println("Простые множители числа " + n + ":");
        printPrimeFactors(n);
        scanner.close();
    }

    public static void printPrimeFactors(int n) {
        System.out.print("1 ");
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}
