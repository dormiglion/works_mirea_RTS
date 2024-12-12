package ru.mirea.work27.task1;

import java.util.HashMap;
import java.util.Map;

public class getSameLastNameCount {
    public static int SameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }
        int count = 0;
        for (int value : lastNameCount.values()) {
            if (value > 1) {
                count += value;
            }
        }
        return count;
    }

    public static void main (String[]args){

        Map<String, String> map = NameSurnameMap.createMap();
        int sameFirstNameCount = NameSurnameMap.getSameFirstNameCount(map);
        int sameLastNameCount = SameLastNameCount(map);

        // System.out.println("Number of people with the same first name: " + sameFirstNameCount);
        // System.out.println("Number of people with the same last name: " + sameLastNameCount);
    }
}
