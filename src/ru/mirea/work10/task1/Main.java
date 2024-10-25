package ru.mirea.work10.task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", "Computer Science", 2, "CS-21");
        System.out.println(student);
        student.setFirstName("Jane");
        student.setCourse(3);

        System.out.println(student);
    }
}
