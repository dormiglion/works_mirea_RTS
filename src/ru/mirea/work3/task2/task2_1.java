package ru.mirea.work3.task2;

public class task2_1 {
    public static void main(String[] args) {
        Double n = Double.valueOf(6.2938);

        String str = "1.634";
        double parsedDouble = Double.parseDouble(str);

        double d = n.doubleValue();
        System.out.println("double: " + d);

        int i = n.intValue();
        System.out.println("int: " + i);

        float f = n.floatValue();
        System.out.println("float: " + f);

        byte b = n.byteValue();
        System.out.println("byte: " + b);

        short s = n.shortValue();
        System.out.println("short: " + s);

        long l = n.longValue();
        System.out.println("long: " + l);


        System.out.println("Значение n: " + n);


        String dString = Double.toString(3.14);
        System.out.println("Преобразование double 3.14 в строку: " + dString);
    }
}
