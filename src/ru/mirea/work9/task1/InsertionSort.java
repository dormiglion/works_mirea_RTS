package ru.mirea.work9.task1;
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
    public static void main(String[] args) {
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
    }
}
