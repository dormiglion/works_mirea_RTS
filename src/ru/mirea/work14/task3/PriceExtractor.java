package ru.mirea.work14.task3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены на товары: 25.98 USD, 44 ERR, 0.004 EU, 99 RUB, 100.5 USD.";
        String regex = "\\b\\d+(\\.\\d{1,3})?\\s(USD|RUB|EU)\\b";
        ArrayList<String> prices = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            prices.add(matcher.group());
        }

        System.out.println("Найденные цены: " + prices);
    }
}