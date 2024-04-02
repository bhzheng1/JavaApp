package com.atguigu.interfaceDemo;

public class TestInterface {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        Flyable.method();
        Bullet bullet = new Bullet();
        bullet.defaultMethod();

        //接口的匿名实现
        Flyable fly = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Anonymous fly");
            }
        };
        fly.fly();
    }
}

class Fighter extends AbstractClass {
    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }
}

class Bullet implements Flyable, Aggressive {
    @Override
    public void attack() {
        System.out.println("Bullet attack");
    }

    @Override
    public void fly() {
        System.out.println("Bullet fly");
    }
    //接口冲突时，必须重写
    public  void defaultMethod(){
        Flyable.super.defaultMethod();
        Aggressive.super.defaultMethod();
        System.out.println("class default method");
    }
}

class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("airplane fly");
    }
}

abstract class AbstractClass implements Flyable, Aggressive{
    //接口冲突时，必须重写
    public  void defaultMethod(){
        System.out.println("abstract default method");
    }
}

interface Bird extends Flyable, Aggressive {
    //接口冲突时，必须重写
    public default void defaultMethod(){
        System.out.println("interface default method");
    }
}

interface Flyable {

    //接口中的属性都是public static final
    public static final String name = "Fly";
    public static final int MIN_SPEED = 0;
    public static final int MAX_SPEED = 7900;

    //接口中的方法是public abstract
    public abstract void fly();

    //接口方法也可以是public static,但只能被接口本身调用
    public static void method(){
        System.out.println("interface static method");
    }

    //接口方法也可以是default，但必须有方法体，被sub class调用或重写
    public default void defaultMethod(){
        System.out.println("interface default method");
    }
}

interface Aggressive {
    void attack();
    public default void defaultMethod(){
        System.out.println("interface default method");
    }
}

