package ru.mirea.work4_1.task3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Неизвестно";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " движется.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }

    public void displayInfo() {
        System.out.println("Имя: " + fullName + ", Возраст: " + age);
    }
}
