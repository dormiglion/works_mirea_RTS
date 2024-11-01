package ru.mirea.work11.task2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате секунды-минуты-часы-дд-мм-гггг: ");
        String inputDate = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("ss-mm-HH-dd-MM-yyyy");

        try {
            Date userDate = dateFormat.parse(inputDate);
            Date currentDate = new Date();

            System.out.println("Ваша дата: " + userDate);
            System.out.println("Текущая дата: " + currentDate);

            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата находится перед текущей дате.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата находится после текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (ParseException e) {
            System.out.println("Дата неправильного формата. Требуется: секунды-минуты-часы-дд-мм-гггг.");
        }
    }
}

