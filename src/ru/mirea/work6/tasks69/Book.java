package ru.mirea.work6.tasks69;

public class Book implements Printable {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}