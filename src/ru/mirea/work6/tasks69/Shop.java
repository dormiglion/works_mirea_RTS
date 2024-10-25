package ru.mirea.work6.tasks69;

import java.util.List;

public class Shop implements Printable {
    private String name;
    private List<String> products;

    public Shop(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public void print() {
        System.out.println("Shop name: " + name);
        System.out.println("Products available:");
        for (String product : products) {
            System.out.println("- " + product);
        }
    }
}
