package ru.mirea.work13.task1;
import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        //2
        System.out.println("Последний символ строки: " + input.charAt(input.length() - 1));

        //3
        System.out.println("Строка заканчивается на '!!!': " + input.endsWith("!!!"));

        //4
        System.out.println("Строка начинается с 'I like': " + input.startsWith("I like"));

        //5
        System.out.println("Строка содержит 'Java': " + input.contains("Java"));

        //6
        int index = input.indexOf("Java");
        System.out.println("Позиция 'Java' в строке: " + index);

        //7
        System.out.println("Строка с замененными 'a' на 'o': " + input.replace('a', 'o'));

        //8
        System.out.println("Строка в верхнем регистре: " + input.toUpperCase());

        //9
        System.out.println("Строка в нижнем регистре: " + input.toLowerCase());

        //10
        if (input.contains("Java")){
            String substring = input.substring(index, index + 4);
            System.out.println("Вырезанная подстрока 'Java': " + substring);
        }else System.out.println("В строке нет 'Java'");
    }
}