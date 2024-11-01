package ru.mirea.work8;
import java.util.Scanner;

public class task2 {
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

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
