package ru.mirea.work13.task5;

public class PhoneNumber {
    private String countryCode;
    private String areaCode;
    private String localNumber;

    // Конструктор, принимающий номер телефона в строковом формате
    public PhoneNumber(String phone) {
        parsePhoneNumber(phone);
    }

    // Метод для парсинга номера телефона
    private void parsePhoneNumber(String phone) {
        // Если номер начинается с +, выделяем код страны
        if (phone.startsWith("+")) {
            countryCode = phone.substring(0, phone.length() - 10);
            areaCode = phone.substring(phone.length() - 10, phone.length() - 7);
            localNumber = phone.substring(phone.length() - 7);
        }
        // Если номер начинается с 8, предполагаем, что это номер для России
        else if (phone.startsWith("8") && phone.length() == 11) {
            countryCode = "+7";
            areaCode = phone.substring(1, 4);
            localNumber = phone.substring(4);
        } else {
            throw new IllegalArgumentException("Некорректный формат номера телефона: " + phone);
        }
    }

    // Метод для форматирования телефона в нужный вид
    public String getFormattedPhoneNumber() {
        return String.format("%s %s-%s-%s",
                countryCode,
                areaCode,
                localNumber.substring(0, 3),
                localNumber.substring(3));
    }

    // Метод main для тестирования
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "+79175655655",
                "89175655655",
                "+104289652211"
        };

        for (String number : phoneNumbers) {
            try {
                PhoneNumber phoneNumber = new PhoneNumber(number);
                System.out.println(phoneNumber.getFormattedPhoneNumber());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}