package ru.mirea.work3.task1;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MathMethod {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        n = scan.nextInt();
        List<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < n; ++i){
            arr.add(Math.random());
        }
        scan.close();
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
