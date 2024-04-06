package com.atguigu.mapDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker {
    private ArrayList<Integer> pokerKey;
    private HashMap<Integer, String> pokerMap;
    private final String[] colors = "♠,♥,♣,♦".split(",");
    private final String[] numbers = "2,3,4,5,6,7,8,9,10,J,Q,K,A".split(",");

    public Poker() {
        pokerKey = new ArrayList<>();
        pokerMap = new HashMap<>();
        pokerKey.add(0);
        pokerKey.add(1);

        int key = 2;
        for (String num : numbers) {
            for (String color : colors) {
                String card = color + num;
                pokerMap.put(key, card);
                pokerKey.add(key);
                key++;
            }
        }

        pokerMap.put(0, "King");
        pokerMap.put(1, "Queen");
    }

    public ArrayList<Integer> getPokerKey() {
        return pokerKey;
    }

    public HashMap<Integer, String> getPokerMap() {
        return pokerMap;
    }

    public void shuffleCards(){
        Collections.shuffle(pokerKey);
    }

    public ArrayList<String> lookPoker(ArrayList<Integer> list){
        ArrayList<String> cards = new ArrayList<>();
        for(Integer i: list){
            cards.add(pokerMap.get(i));
        }
        return cards;
    }
}
