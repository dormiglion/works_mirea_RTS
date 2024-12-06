package ru.mirea.work19.task2;

import java.util.ArrayList;

public class LabClass {
    private ArrayList<Student> students;

    public LabClass(ArrayList<Student> students) {
        this.students = students;
    }

    public Student findByName(String name) throws EmptyStringExc {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringExc("name cannot be empty");
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new NoStudentExc("Студент по имени " + name + " не найден");
    }

    public void SortingStudentsByGPA(){
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        this.students = sorter.qSort(getStudents());
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
