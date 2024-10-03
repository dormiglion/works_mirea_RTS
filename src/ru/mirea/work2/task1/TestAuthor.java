package ru.mirea.work2.task1;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        String email;
        Author pushkin = new Author("Александр Сергеевич Пушкин", "sanya1799xD@edu.mirea.ru", 'M');
        System.out.println("Имя автора: " + pushkin.getName());
        System.out.println("Email автора: " + pushkin.getEmail());
        System.out.println("Пол автора: " + pushkin.getGender());
        Scanner newEmail = new Scanner(System.in);
        System.out.println("Введите новый email: ");
        email = newEmail.next();
        pushkin.setEmail(email);
        System.out.println(pushkin.toString());
    }
}
