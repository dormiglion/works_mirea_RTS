package ru.mirea.work2.task2;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args){
        int n;
        Cards cards = new Cards();
        cards.Shuffle();
        List<String> scards = cards.getCards();
        Scanner newn = new Scanner(System.in);
        do {
            System.out.println("Введите количество игроков, не больше 10!: ");
            n = newn.nextInt();
        }
        while (n > 10);
        for (int i = 0; i < n; ++i){
            System.out.println("Карты " + (i + 1) + " игрока: " + scards.subList(5 * i, 5 * i + 5).toString());
        }
    }
}
