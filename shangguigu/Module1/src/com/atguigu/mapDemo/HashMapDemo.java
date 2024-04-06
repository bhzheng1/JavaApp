package com.atguigu.mapDemo;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //RunDemoA();
        //RunDemoB();
       RunPokerDemo();
    }

    public static void RunDemoA() {
        HashMap<String, String> map = new HashMap<>();
        map.put("John", "Anna");
        map.put("Alex", "Elia");

        /*
            Map.Entry 中保存的都是key, value links
        */
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":::::" + value);
        }
    }

    public static void RunDemoB() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person(20, "John"), "Maryland");
        map.put(new Person(30, "Anna"), "Maryland");
        map.put(new Person(25, "Lee"), "Massachusetts");
        map.put(new Person(25, "Lee"), "Massachusetts");
        System.out.println(map);
    }

    public static void RunPokerDemo(){
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> hold = new ArrayList<>();

        Poker poker = new Poker();
        poker.shuffleCards();
        ArrayList<Integer> list = poker.getPokerKey();
        HashMap<Integer, String> map = poker.getPokerMap();

        // 发牌
        for(int i=0; i<list.size(); i++){
            Integer key = list.get(i);
            if(i>=list.size()-3){
                hold.add(key);
            }
            else {
                switch (i%3){
                    case 0:
                        p1.add(key);
                        break;
                    case 1:
                        p2.add(key);
                        break;
                    case 2:
                        p3.add(key);
                        break;
                }
            }
        }

        // 排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(hold);
        System.out.println("John :" + poker.lookPoker(p1));
        System.out.println("Alex :" + poker.lookPoker(p2));
        System.out.println("Barry :" + poker.lookPoker(p3));
        System.out.println("Ryan :" + poker.lookPoker(hold));
    }
}

