package ru.mirea.work7.task4;

public class Main {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double base = 2;
        int exponent = 3;
        System.out.println(base + " в степени " + exponent + " = " + mathFunc.pow(base, exponent));

        double real = 3;
        double imaginary = 4;
        System.out.println("Модуль комплексного числа (" + real + " + " + imaginary + "i) = " + mathFunc.absComplex(real, imaginary));

        double radius = 5;
        System.out.println("Длина окружности с радиусом " + radius + " = " + mathFunc.circumference(radius));
    }
}
