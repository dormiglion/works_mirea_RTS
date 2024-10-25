package ru.mirea.work4_1.task1;

public class ShapeTester {
    public static void main(String[] args) {
        // Создаем объекты фигур
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(4.0);

        // Вывод информации об объектах
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        // Демонстрация вызова методов через родительскую ссылку
        System.out.println("Тип фигуры: " + circle.getType());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        System.out.println("Тип фигуры: " + rectangle.getType());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        System.out.println("Тип фигуры: " + square.getType());
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
    }
}
