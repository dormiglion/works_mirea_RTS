package ru.mirea.work6.tasks69;

import java.util.Arrays;
import java.util.List;

public class Main_1 {
    public static void main(String[] args){
        List<String> products = Arrays.asList("Bread", "Milk", "Eggs", "Cheese");
        Shop shop = new Shop("SuperMart", products);
        shop.print();


        Printable book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book.print();
    }
}
