package ru.mirea.work11.task1;
import java.util.Date;

public class DevInfo {
    final private String developerName;
    final private Date assignmentReceived;
    private Date assignmentSubmitted;

    public DevInfo(String developerName, Date assignmentReceived) {
        this.developerName = developerName;
        this.assignmentReceived = assignmentReceived; // Время получения задания
    }

    public void submitAssignment() {
        this.assignmentSubmitted = new Date(); // Время сдачи задания
    }

    public void displayInfo() {
        System.out.println("Разработчик: " + developerName);
        System.out.println("Задание получено: " + this.assignmentReceived);
        System.out.println("Задание выполнено: " + this.assignmentSubmitted);
    }

    public static void main(String[] args) {
        DevInfo info = new DevInfo("Софья", new Date(124, 8, 1, 9, 30, 15));
        info.submitAssignment();
        info.displayInfo();
    }
}
