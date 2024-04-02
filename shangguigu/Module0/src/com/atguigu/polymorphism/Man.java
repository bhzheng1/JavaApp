package com.atguigu.polymorphism;

public class Man extends Person {

    //父类的同名属性为子类的隐藏字段
    int id = 1002;

    @Override
    public void eat() {
        System.out.println("man eat");
    }
    @Override
    public void run(){
        System.out.println("Man run fast");
    }

    public void earnMoney(){
        System.out.println("Man earn money");
    }
}
