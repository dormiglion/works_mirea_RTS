package ru.mirea.work3.task1;
import java.util.*;
import java.util.Collections;

public class RandomMethod {
    public static void main(String args[]){
        Random rand = new Random();
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        n = scan.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < n; ++i){
            arr.add(rand.nextInt(100));
        }
        scan.close();
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
