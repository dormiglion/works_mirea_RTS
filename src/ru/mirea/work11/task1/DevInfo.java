package ru.mirea.work11.task1;
import java.util.Date;

public class DevInfo {
    private String developerName;
    private Date assignmentReceived;
    private Date assignmentSubmitted;

    public DevInfo(String developerName, Date assignmentReceived) {
        this.developerName = developerName;
        this.assignmentReceived = assignmentReceived; // Время получения задания
    }

    public void submitAssignment() {
        this.assignmentSubmitted = new Date(); // Время сдачи задания
    }

    public void displayInfo() {
        System.out.println("Developer: " + developerName);
        System.out.println("Assignment received: " + assignmentReceived);
        System.out.println("Assignment submitted: " + assignmentSubmitted);
    }

    public static void main(String[] args) {
        DevInfo info = new DevInfo("Sonya", new Date(124, 8, 1, 9, 30, 15));
        info.submitAssignment();
        info.displayInfo();
    }
}
