package ru.mirea.work8;
import java.util.Scanner;

public class task5 {
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

        int result = sumDigits(n);
        System.out.println("Сумма цифр числа " + n + " равна: " + result);

        scanner.close();
    }
    public static int sumDigits(int N) {
        if (N == 0) {
            return 0;
        }
        return (N % 10) + sumDigits(N / 10);
    }
}
