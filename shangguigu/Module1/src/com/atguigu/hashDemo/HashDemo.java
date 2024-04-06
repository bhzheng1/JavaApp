package com.atguigu.hashDemo;

public class HashDemo{
    public static void main(String[] args) {
        System.out.println("abc".hashCode());
    }

    public static void RunDemo1(){
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Alex", 20);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(Integer.toHexString(p2.hashCode()));
        System.out.println(p1.name.hashCode());
        System.out.println(p2.name.hashCode());
    }
}
