package com.atguigu.polymorphism;

public class Woman extends Person
{
    @Override
    public void eat() {
        System.out.println("worman eat");
    }
    @Override
    public void run(){
        System.out.println("Woman run slow");
    }
}
