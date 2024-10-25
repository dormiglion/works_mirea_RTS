package ru.mirea.work8;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();
        int result = sumDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна: " + result);

        scanner.close();
    }
    public static int sumDigits(int N) {
        if (N == 0) {
            return 0;
        }
        return (N % 10) + sumDigits(N / 10);
    }
}
