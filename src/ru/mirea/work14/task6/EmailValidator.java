package ru.mirea.work14.task6;

import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"
        };
        for (String email : emails) {
            System.out.println("E-mail: " + email + " -> " + (isValidEmail(email) ? "корректный" : "некорректный"));
        }
    }
}
