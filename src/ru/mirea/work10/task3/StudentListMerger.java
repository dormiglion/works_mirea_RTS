package ru.mirea.work10.task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentListMerger {
    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("John", "Doe", "Computer Science", 3.6));
        list1.add(new Student("Alice", "Smith", "Mathematics", 3.8));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Bob", "Brown", "Physics", 3.4));
        list2.add(new Student("Jane", "Johnson", "Biology", 3.7));

        List<Student> mergedList = mergeAndSortLists(list1, list2);

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
    public static List<Student> mergeAndSortLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList, Comparator.comparingDouble(Student::getGpa).reversed());

        return mergedList;
    }
}
