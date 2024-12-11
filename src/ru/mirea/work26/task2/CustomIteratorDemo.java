package ru.mirea.work26.task2;

import java.util.ArrayList;
import java.util.List;

public class CustomIteratorDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");

        CustomListIterator<String> iterator = new CustomListIterator<>(myList);

        System.out.println("Iterating over the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Пример удаления
        System.out.println("\nRemoving an element using custom iterator:");
        iterator = new CustomListIterator<>(myList);
        if (iterator.hasNext()) {
            iterator.next(); // Перейти к первому
            iterator.remove(); // del
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
