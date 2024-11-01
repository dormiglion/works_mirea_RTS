package ru.mirea.work8;
import java.util.Scanner;

public class task1 {
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

        printTriangleSequence(n);
        scanner.close();
    }

    public static void printTriangleSequence(int n) {
        int currentNumber = 1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(currentNumber + " ");
            count++;

            if (count == currentNumber) {
                currentNumber++;
                count = 0;
            }
        }
    }

}
