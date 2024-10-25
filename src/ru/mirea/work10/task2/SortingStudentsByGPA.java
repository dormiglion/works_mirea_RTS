package ru.mirea.work10.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortingStudentsByGPA {
    private Student[] students;

    public void setArray(int size) {
        students = new Student[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            students[i] = new Student(
                    "Student" + (i + 1),
                    "LastName" + (i + 1),
                    "Major" + (rand.nextInt(3) + 1),
                    2 + rand.nextDouble() * 2 // Генерация GPA от 2.0 до 4.0
            );
        }
    }

    public void quicksort(Comparator<Student> comparator) {
        quickSort(students, comparator, 0, students.length - 1);
    }

    private void quickSort(Student[] array, Comparator<Student> comparator, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, comparator, low, high);
            quickSort(array, comparator, low, pivotIndex - 1);
            quickSort(array, comparator, pivotIndex + 1, high);
        }
    }

    private int partition(Student[] array, Comparator<Student> comparator, int low, int high) {
        Student pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(Student[] array, int i, int j) {
        Student temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void mergeSort(Comparator<Student> comparator) {
        if (students.length > 1) {
            Student[] left = Arrays.copyOfRange(students, 0, students.length / 2);
            Student[] right = Arrays.copyOfRange(students, students.length / 2, students.length);
            mergeSort(left, comparator);
            mergeSort(right, comparator);
            merge(left, right);
        }
    }

    private void mergeSort(Student[] array, Comparator<Student> comparator) {
        if (array.length > 1) {
            Student[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            Student[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
            mergeSort(left, comparator);
            mergeSort(right, comparator);
            merge(left, right);
        }
    }

    private void merge(Student[] left, Student[] right) {
        Student[] merged = new Student[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].getGpa() >= right[rightIndex].getGpa()) {
                merged[mergedIndex++] = left[leftIndex++];
            } else {
                merged[mergedIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            merged[mergedIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            merged[mergedIndex++] = right[rightIndex++];
        }

        students = merged;
    }
    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(10);

        System.out.println("Студенты до сортировки:");
        sorter.outArray();

        sorter.quicksort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("\nСтуденты после быстрой сортировки по GPA:");
        sorter.outArray();

        sorter.mergeSort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("\nСтуденты после сортировки слиянием по GPA:");
        sorter.outArray();
    }
}