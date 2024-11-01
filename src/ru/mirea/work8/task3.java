package ru.mirea.work8;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        do {
            System.out.print("Введите натуральное число A (A > 1): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: необходимо ввести натуральное число больше 1.");
                scanner.next();
            }
            A = scanner.nextInt();
        } while (A <= 1);

        int B;
        do {
            System.out.print("Введите натуральное число B (B > 1): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: необходимо ввести натуральное число больше 1.");
                scanner.next();
            }
            B = scanner.nextInt();
        } while (B <= 1);

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
