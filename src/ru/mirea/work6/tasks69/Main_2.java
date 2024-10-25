package ru.mirea.work6.tasks69;

public class Main_2 {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Book("1984", "George Orwell"),
                new Book("Brave New World", "Aldous Huxley"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("To Kill a Mockingbird", "Harper Lee")
        };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
