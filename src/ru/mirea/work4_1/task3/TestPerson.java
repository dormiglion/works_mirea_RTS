package ru.mirea.work4_1.task3;

public class TestPerson {
    public static void main(String[] args){
    Person person1 = new Person();
        person1.displayInfo();
        person1.move();
        person1.talk();

    // Создание второго объекта с использованием конструктора с параметрами
    Person person2 = new Person("Софья Афонина", 19);
        person2.displayInfo();
        person2.move();
        person2.talk();
    }
}
