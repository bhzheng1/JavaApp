package com.atguigu.abstractDemo;

// abstract class can not be initialized, even only has fields or properties
public abstract class Animal {
    public Animal(String name){
        name  = name;
    }
    public String name;
}
