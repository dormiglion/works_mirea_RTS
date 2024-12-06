package ru.mirea.work18;

import java.util.Scanner;

public class Task7 {
    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        printDetails(key);
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            // задание 8
            System.out.println("Please enter the key again:");
            getKey();}
    }

    private static String getDetails(String key) {
        // 7 Задание
//        try {
//            if (key == "") {
//                throw new Exception("Key set to empty string");
//            }
//            return "data for " + key;
//        } catch (Exception e) {
//            System.out.println("Caught Exception: " + e.getMessage());
//            return "data for " + key;
//        }

        // 8 Задание
        try {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            // null
            return null;
        }
    }
    public static void main(String[] args) {
        getKey();
    }
}