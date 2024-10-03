package ru.mirea.work2.task2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class Cards {
    private List<String> cards = new ArrayList<String>();
    public Cards(){
        HashMap<Integer,String> values = new HashMap<Integer,String>(4);
        values.put(11, "Валет");
        values.put(12, "Дама");
        values.put(13, "Король");
        values.put(14, "Туз");

        HashMap<Integer,String> suits = new HashMap<Integer,String>(4);
        suits.put(1, "Пики");
        suits.put(2, "Черви");
        suits.put(3, "Бубны");
        suits.put(4, "Трефы");

        int c = 0;
        for(int j = 1; j < 5; ++j){
            for(int i = 2; i < 15; ++i){
                if (i < 11) {
                  cards.add(i + " " + suits.get(j));
                }
                else {
                    cards.add(values.get(i) + " " + suits.get(j));
                }
            }
            c += 1;
        }
    }
    public void Shuffle(){
        Collections.shuffle(cards);
    }
    public List<String> getCards() {return cards;}
}
