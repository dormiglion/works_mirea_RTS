package ru.mirea.work19.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    public LabClassUI(LabClass labClass){
        this.labClass = labClass;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберите действие:");
            System.out.println("1) Поиск студента по имени");
            System.out.println("2) Сортировка по GPA");
            System.out.println("3) Показать всех студентов");
            System.out.println("4) Выход");

            try {
                int opNum = scanner.nextInt();
                scanner.nextLine();
                switch (opNum){
                    case 1:
                        System.out.println("Введите имя студента: ");
                        String name = scanner.nextLine();
                        try {
                            Student student = labClass.findByName(name);
                            System.out.println(student);
                        } catch (EmptyStringExc e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        } catch (NoStudentExc e) {
                            System.out.println("Ошибка!: " + e.getMessage());
                        }
                        break;
                    case 2:
                        labClass.SortingStudentsByGPA();
                        System.out.println("Sorting done");
                        break;
                    case 3:
                        for (Student student: labClass.getStudents()){
                            System.out.println(student);
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Ошибка: введите число от 1 до 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
