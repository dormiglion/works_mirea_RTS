package ru.mirea.work13.task4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    // Конструктор, который принимает строку и разделяет её на части
    public Shirt(String shirtInfo) {
        String[] parts = shirtInfo.split(",");
        if (parts.length == 4) {
            this.id = parts[0];
            this.name = parts[1];
            this.color = parts[2];
            this.size = parts[3];
        } else {
            throw new IllegalArgumentException("Некорректный формат данных для футболки: " + shirtInfo);
        }
    }

    // Метод toString(), который выводит все поля построчно
    @Override
    public String toString() {
        return "Shirt ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Color: " + color + "\n" +
                "Size: " + size + "\n";
    }

    // Метод main для создания массива Shirt и вывода на консоль
    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        // Создаем массив объектов Shirt
        Shirt[] shirtObjects = new Shirt[shirts.length];

        // Заполняем массив shirtObjects, преобразуя строки в объекты Shirt
        for (int i = 0; i < shirts.length; i++) {
            shirtObjects[i] = new Shirt(shirts[i]);
        }

        // Выводим информацию о каждой футболке на консоль
        for (Shirt shirt : shirtObjects) {
            System.out.println(shirt);
        }
    }
}
