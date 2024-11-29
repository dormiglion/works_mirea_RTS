package ru.mirea.work18;

public class Exception1 {
    public static void exceptionDemo() {
        System.out.println( 2.0 / 0.0 );
    }

    public static void exception1() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
        exception1();
    }
}