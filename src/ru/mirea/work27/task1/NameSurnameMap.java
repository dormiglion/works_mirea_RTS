package ru.mirea.work27.task1;

import java.util.HashMap;
import java.util.Map;

public class NameSurnameMap {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Johnson", "Emily");
        map.put("Williams", "John");
        map.put("Jones", "Michael");
        map.put("Brown", "Sarah");
        map.put("Davis", "Emily");
        map.put("Miller", "James");
        map.put("Wilson", "Michael");
        map.put("Moore", "Jessica");
        map.put("Taylor", "John");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String name : map.values()) {
            firstNameCount.put(name, firstNameCount.getOrDefault(name, 0) + 1);
        }
        int count = 0;
        for (int value : firstNameCount.values()) {
            if (value > 1) {
                count += value;
            }
        }
        return count;
    }
}