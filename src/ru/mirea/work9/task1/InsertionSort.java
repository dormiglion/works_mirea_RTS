package ru.mirea.work9.task1;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void shakerSort(Student[] students) {
        boolean swapped;
        int start = 0;
        int end = students.length - 1;

        do {
            swapped = false;

            // Проход слева направо
            for (int i = start; i < end; i++) {
                if (students[i].compareTo(students[i + 1]) > 0) {  // Используем compareTo() для сравнения
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    swapped = true;
                }
            }

            // Сдвигаем конец на одну позицию назад
            end--;

            // Проход справа налево
            for (int i = end; i > start; i--) {
                if (students[i].compareTo(students[i - 1]) < 0) {  // Используем compareTo() для сравнения
                    Student temp = students[i];
                    students[i] = students[i - 1];
                    students[i - 1] = temp;
                    swapped = true;
                }
            }

            // Сдвигаем начало на одну позицию вперед
            start++;
        } while (swapped);
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[5];
        students[0] = new Student(3, "Alice");
        students[1] = new Student(1, "Bob");
        students[2] = new Student(4, "Charlie");
        students[3] = new Student(2, "David");
        students[4] = new Student(5, "Eve");

        insertionSort(students);
        System.out.println("Отсортированные студенты по ID:");
        for (Student student : students) {
            System.out.println(student);
        }
        scanner.close();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
    }
}
