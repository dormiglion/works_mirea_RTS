package ru.mirea.work11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComp {
    public static void comparePerformance() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start, end;

        // Операция добавления
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) arrayList.add(i);
        end = System.nanoTime();
        System.out.println("ArrayList add: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) linkedList.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList add: " + (end - start) + " ns");

        // Операция поиска
        start = System.nanoTime();
        arrayList.contains(5000);
        end = System.nanoTime();
        System.out.println("ArrayList contains: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.contains(5000);
        end = System.nanoTime();
        System.out.println("LinkedList contains: " + (end - start) + " ns");

        // Операция удаления
        start = System.nanoTime();
        arrayList.remove(5000);
        end = System.nanoTime();
        System.out.println("ArrayList remove: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.remove(5000);
        end = System.nanoTime();
        System.out.println("LinkedList remove: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        comparePerformance();
    }
}