package ru.mirea.work8;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (без нулей): ");
        int n = scanner.nextInt();
        int reversed = reverse(n);
        System.out.println("Разворот числа: " + reversed);
        scanner.close();
    }
    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int digits = (int) Math.log10(n);

        return lastDigit * (int) Math.pow(10, digits) + reverse(n / 10);
    }
}
