package com.atguigu.designPattern;

public class Singleton {
    //1. 私有化构造器，使外部不能new调用构造器生成实例
    private Singleton(){}

    //2. 在类的内部创建实例，必须为static
    private static final Singleton instance = new Singleton();

    //3. 使用get方法获取当前类的实例，必须声明为static，只被类调用
    public static Singleton getInstance(){
        return instance;
    }
}