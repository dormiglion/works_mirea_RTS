package ru.mirea.work25.task5;

public class PassChecker {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        String[] passwords = {"F032_Password",
                "TrySpy__1",
                "smart_pass",
                "A007"};
        for (String pass: passwords){
            System.out.println("Password: \"" + pass + "\" is " + (pass.matches(regex)?"":"un") + "secured");
        }
    }
}
