package ru.mirea.work18;
import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer");
            String intString = scanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

//        } catch (Exception e) {                        // 3 задание
//            System.out.println("Exception error");
//        }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        finally {            // 4 задание
            scanner.close();
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}