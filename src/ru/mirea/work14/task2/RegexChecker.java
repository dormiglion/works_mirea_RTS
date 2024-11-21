package ru.mirea.work14.task2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexChecker {
    public static boolean isValidString(String input) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        return matcher.matches();
        return pattern.matcher(input).matches();
    }

    public static void main(String[] args) {
        String validString = "abcdefghijklmnopqrstuv18340";
        String invalidString = "abcdefghijklmnoasdfasdpqrstuv18340";

        System.out.println("Строка '" + validString + "' является корректной? " + isValidString(validString));
        System.out.println("Строка '" + invalidString + "' является корректной? " + isValidString(invalidString));
    }
}