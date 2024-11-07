package ru.mirea.work11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComp {
    public static void comparePerformance() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start, end;

        // вставка в начало
        start = System.nanoTime();
        arrayList.add(0, -1);
        end = System.nanoTime();
        System.out.println("ArrayList insert at beginning: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.add(0, -1);
        end = System.nanoTime();
        System.out.println("LinkedList insert at beginning: " + (end - start) + " ns");

        // вставка в середину
        start = System.nanoTime();
        arrayList.add(arrayList.size() / 2, -1);
        end = System.nanoTime();
        System.out.println("ArrayList insert in middle: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.add(linkedList.size() / 2, -1);
        end = System.nanoTime();
        System.out.println("LinkedList insert in middle: " + (end - start) + " ns");

        // вставка в конец
        start = System.nanoTime();
        arrayList.add(arrayList.size(), -1);
        end = System.nanoTime();
        System.out.println("ArrayList insert at end: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.add(linkedList.size(), -1);
        end = System.nanoTime();
        System.out.println("LinkedList insert at end: " + (end - start) + " ns");

        // add
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) arrayList.add(i);
        end = System.nanoTime();
        System.out.println("ArrayList add: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) linkedList.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList add: " + (end - start) + " ns");

        // find
        start = System.nanoTime();
        arrayList.contains(5000);
        end = System.nanoTime();
        System.out.println("ArrayList contains: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.contains(5000);
        end = System.nanoTime();
        System.out.println("LinkedList contains: " + (end - start) + " ns");

        // rem
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