package ru.mirea.work7.task6;

public class ProcessStrings implements StringProcessor {

    @Override
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    public int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
