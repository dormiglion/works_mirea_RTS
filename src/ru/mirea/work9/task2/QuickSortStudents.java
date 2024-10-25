package ru.mirea.work9.task2;
import java.util.Comparator;

public class QuickSortStudents {
    public static void quickSort(Student[] students, Comparator<Student> comparator, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, comparator, low, high);
            quickSort(students, comparator, low, pivotIndex - 1);
            quickSort(students, comparator, pivotIndex + 1, high);
        }
    }
    private static int partition(Student[] students, Comparator<Student> comparator, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) < 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }
    private static void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.5),
                new Student("Bob", 3.9),
                new Student("Charlie", 3.2),
                new Student("David", 4.0),
                new Student("Eve", 3.7)
        };
        SortingStudentsByGPA gpaComparator = new SortingStudentsByGPA();

        quickSort(students, gpaComparator, 0, students.length - 1);
        System.out.println("Студенты, отсортированные по GPA (в порядке убывания):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
