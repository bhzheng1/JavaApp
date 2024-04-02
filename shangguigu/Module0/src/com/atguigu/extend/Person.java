package com.atguigu.extend;

public class Person {
    String name;
    int id;
    private int age;
    public void eat(){
        System.out.println("person eat");
    }
    public void sleep(){
        System.out.println("person sleep");
    }
    public Person()
    {
        System.out.println("person ctor");
    }
    public Person(String name){
        System.out.println("person name ctor");
        this.name   = name;
    }
}
