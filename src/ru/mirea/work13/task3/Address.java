package ru.mirea.work13.task3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Конструктор для инициализации через метод split()
    public void parseAddressWithComma(String address) {
        // Разделяем строку по запятой и удаляем пробелы по краям
        String[] parts = address.split(",");
        if (parts.length != 7) {
            throw new IllegalArgumentException("Некорректный формат адреса.");
        }

        // Заполняем поля, обрезая пробелы у каждой части
        country = parts[0].trim();
        region = parts[1].trim();
        city = parts[2].trim();
        street = parts[3].trim();
        house = parts[4].trim();
        building = parts[5].trim();
        apartment = parts[6].trim();
    }

    // Конструктор для инициализации через StringTokenizer
    public void parseAddressWithDelimiters(String address) {
        // Используем StringTokenizer с разделителями , . ;
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");

        if (tokenizer.countTokens() != 7) {
            throw new IllegalArgumentException("Некорректный формат адреса.");
        }

        // Заполняем поля, обрезая пробелы у каждой части
        country = tokenizer.nextToken().trim();
        region = tokenizer.nextToken().trim();
        city = tokenizer.nextToken().trim();
        street = tokenizer.nextToken().trim();
        house = tokenizer.nextToken().trim();
        building = tokenizer.nextToken().trim();
        apartment = tokenizer.nextToken().trim();
    }

    // Метод для вывода адреса
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();
        Address address4 = new Address();

        // Тест с запятой как разделителем
        address1.parseAddressWithComma("Россия, Московская область, Москва, Тверская улица, 15, корпус 1, квартира 10");
        System.out.println("Результат parseAddressWithComma: " + address1);

        // Тест с любым из разделителей
        address2.parseAddressWithDelimiters("Россия. Московская область; Москва, Тверская улица, 15; корпус 1. квартира 10");
        System.out.println("Результат parseAddressWithDelimiters: " + address2);

        // Другие примеры
        address3.parseAddressWithComma("США, Калифорния, Лос-Анджелес, Голливудский бульвар, 123, корпус B, квартира 45");
        System.out.println("Результат parseAddressWithComma: " + address3);

        address4.parseAddressWithDelimiters("Германия; Бавария. Мюнхен; Мариенплац. 1, корпус А; квартира 5");
        System.out.println("Результат parseAddressWithDelimiters: " + address4);
    }
}