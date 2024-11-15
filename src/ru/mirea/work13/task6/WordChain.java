package ru.mirea.work13.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordChain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слова, разделенные пробелом: ");
        String input = scanner.nextLine();
        scanner.close();

        List<String> words = new ArrayList<>();
        Collections.addAll(words, input.split("\\s+"));

        String result = getLine(words);
        System.out.println(result);
    }

    public static String getLine(List<String> words) {
        if (words == null || words.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        result.append(words.remove(0));

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                String lastWord = result.substring(result.lastIndexOf(" ") + 1);
                String nextWord = words.get(j);

                if (Character.toLowerCase(lastWord.charAt(lastWord.length() - 1)) ==
                        Character.toLowerCase(nextWord.charAt(0))) {
                    result.append(" ").append(words.remove(j));
                    i = -1;
                    break;
                }
            }
        }

        return result.toString();
    }
}