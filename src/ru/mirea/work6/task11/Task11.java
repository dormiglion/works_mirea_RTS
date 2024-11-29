package ru.mirea.work6.task11;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        Convertible kelvinConverter = new CelToKel();
        Convertible fahrenheitConverter = new CelToFahr();

        double kelvin = kelvinConverter.convert(celsius);
        double fahrenheit = fahrenheitConverter.convert(celsius);

        System.out.printf("Температура в Кельвинах: %.2f K%n", kelvin);
        System.out.printf("Температура в Фаренгейтах: %.2f °F%n", fahrenheit);
    }
}
