package ru.mirea.work19.task2;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class SortingStudentsByGPA implements Comparator<Student>{
    public ArrayList<Student> qSort(ArrayList<Student> arr){
        ArrayList<Student> less = new ArrayList<>();
        ArrayList<Student> more = new ArrayList<>();
        ArrayList<Student> pivot = new ArrayList<>();
        if(!arr.isEmpty()) {
            pivot.add(arr.getFirst());
            for (Student student : arr) {
                if (this.compare(pivot.getFirst(), student) > 0) {
                    less.add(student);
                } else if (this.compare(pivot.getFirst(), student) < 0) {
                    more.add(student);
                }
            }
            less = qSort(less);
            more = qSort(more);
            less.addAll(pivot);
            less.addAll(more);
        }
        return less;
    }

    public ArrayList<Student> reversedQSort(ArrayList<Student> arr){
        ArrayList<Student> sorted = this.qSort(arr);
        Collections.reverse(sorted);
        return sorted;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }
}
