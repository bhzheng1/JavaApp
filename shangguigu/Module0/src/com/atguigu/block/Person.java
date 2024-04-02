package com.atguigu.block;

public class Person {
    String name;
    int id;
    private int age;

    static String info = "I am a person";

    public void eat() {
        System.out.println("person eat");
    }

    public void sleep() {
        System.out.println("person sleep");
    }

    public Person() {
        System.out.println("person constructor");
    }

    public Person(String name) {
        System.out.println("person name constructor");
        this.name = name;
    }

    // 非静态代码块，随着对象的创建而执行
    {
        System.out.println("non static block: " + info);
        System.out.println("non static block: " + this.name);
    }
   // 静态代码块，类的加载只会执行一次，所以静态代码块也只会执行一次
   static {
       System.out.println("static block: " + info);
   }
}
