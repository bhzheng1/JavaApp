package com.atguigu.poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {

        String[] colors = "♥,♦,♣,♠".split(",");
        String[] numbers = "A,2,3,4,5,6,7,8,9,10,J,Q,K".split(",");
        ArrayList<String> poker = new ArrayList<>();

        for(String number: numbers){
            for (String color : colors){
                String pokerNumber = color+number;
                poker.add(pokerNumber);
            }
        }
        Collections.shuffle(poker);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> hold = new ArrayList<>();

        for (int i=0; i<poker.size(); i++)
        {
            String s = poker.get(i);
            if (i>=poker.size()-3){
                hold.add(s);
            }
            else
            {
               switch (i%3){
                   case 0:
                       p1.add(s);
                       break;
                   case 1:
                       p2.add(s);
                       break;
                   case 2:
                       p3.add(s);
                       break;
               }
            }
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(hold);
    }
}
