//package ru.mirea.work9.task1;
//
//public class ShakerSort {
//    public static void shakerSort(Student[] students) {
//        boolean swapped;
//        int start = 0;
//        int end = students.length - 1;
//
//        do {
//            swapped = false;
//
//            // Проход слева направо
//            for (int i = start; i < end; i++) {
//                if (students[i] > students[i + 1]) {
//                    int temp = students[i];
//                    students[i] = students[i + 1];
//                    students[i + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            // Сдвигаем конец на одну позицию назад
//            end--;
//
//            // Проход справа налево
//            for (int i = end; i > start; i--) {
//                if (students[i] < students[i - 1]) {
//                    int temp = students[i];
//                    students[i] = students[i - 1];
//                    students[i - 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            // Сдвигаем начало на одну позицию вперед
//            start++;
//        } while (swapped);
//
//    }
//}
