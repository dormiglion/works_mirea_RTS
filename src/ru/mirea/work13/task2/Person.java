package ru.mirea.work13.task2;

public class Person {
    private final String lastName;  // Фамилия
    private final String firstName; // Имя
    private final String middleName; // Отчество

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        if (this.lastName != null && !this.lastName.isEmpty()) {
            fullName.append(this.lastName);
        }

        if (this.firstName != null && !this.firstName.isEmpty()) {
            fullName.append(" ").append(this.firstName.charAt(0)).append(".");
        }

        if (this.middleName != null && !this.middleName.isEmpty()) {
            fullName.append(this.middleName.charAt(0)).append(".");
        }
        return fullName.toString().trim();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр", null);
        Person person3 = new Person("Сидоров", null, null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}