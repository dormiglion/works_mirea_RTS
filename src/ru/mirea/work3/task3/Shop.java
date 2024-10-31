package ru.mirea.work3.task3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceInUSD = 100.0;

        System.out.print("Введите количество товаров: ");
        int quantity = scanner.nextInt();

        double totalPriceInUSD = priceInUSD * quantity;

        System.out.println("Выберите валюту для оплаты:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. JPY");
        System.out.println("4. CNY");

        int currencyChoice = scanner.nextInt();
        scanner.close();

        Locale locale;
        NumberFormat currencyFormatter;

        switch (currencyChoice) {
            case 1: // USD
                locale = Locale.US;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                break;
            case 2: // EUR
                locale = Locale.FRANCE;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                totalPriceInUSD *= 0.85;
                break;
            case 3: // JPY
                locale = Locale.JAPAN;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                totalPriceInUSD *= 110;
                break;
            case 4: // CNY
                locale = Locale.CHINESE;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                totalPriceInUSD *= 7.08;
                break;
            default:
                System.out.println("Неправильный выбор валюты. Используем USD.");
                locale = Locale.US;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                break;
        }

        System.out.println("Итоговая стоимость: " + currencyFormatter.format(totalPriceInUSD));
    }
}

