package ru.mirea.work26.task3;

public class CustomListDemo {
    public static void main(String[] args) {
        CustomList<String> myList = new CustomList<>();
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");

        System.out.println("Iterating over the custom list:");
        for (String item : myList) {
            System.out.println(item);
        }

        System.out.println("\nAccessing elements by index:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}