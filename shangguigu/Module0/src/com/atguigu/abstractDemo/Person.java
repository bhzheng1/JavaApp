package com.atguigu.abstractDemo;

public abstract class Person {
    String name;
    int age;

    //实例化子类的时候，就会初始化父类，不管父类是不是抽象类都会调用父类的构造方法。
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}
