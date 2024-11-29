package ru.mirea.work19;

import java.util.Scanner;

public class InnCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        String fullName = scanner.nextLine();

        System.out.println("Введите номер ИНН:");
        String inn = scanner.nextLine();

        try {
            validateINN(inn);
            System.out.println("Заказ успешно оформлен для клиента: " + fullName);
        } catch (INNException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static void validateINN(String inn) throws INNException {
        if (inn == null || inn.length() != 12) {
            throw new INNException("Недействительный ИНН: " + inn);
        }
    }
}


