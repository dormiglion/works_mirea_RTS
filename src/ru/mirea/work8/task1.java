package ru.mirea.work8;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
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
