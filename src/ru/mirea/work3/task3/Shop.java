package ru.mirea.work3.task3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Цена товара в базовой валюте (USD)
        double priceInUSD = 100.0;

        // Ввод количества товаров
        System.out.print("Введите количество товаров: ");
        int quantity = scanner.nextInt();

        // Рассчет итоговой стоимости в долларах
        double totalPriceInUSD = priceInUSD * quantity;

        // Вывод доступных валют для выбора
        System.out.println("Выберите валюту для оплаты:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. JPY");
        System.out.println("4. CNY");

        // Ввод выбора валюты
        int currencyChoice = scanner.nextInt();
        scanner.close();

        // Объявление переменных для выбранной валюты и локализации
        Locale locale;
        NumberFormat currencyFormatter;

        // Определение локализации и курс валют в зависимости от выбора
        switch (currencyChoice) {
            case 1: // USD
                locale = Locale.US;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                break;
            case 2: // EUR
                locale = Locale.FRANCE;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                totalPriceInUSD *= 0.85; // Примерный курс USD -> EUR
                break;
            case 3: // JPY
                locale = Locale.JAPAN;
                currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                totalPriceInUSD *= 110; // Примерный курс USD -> JPY
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

