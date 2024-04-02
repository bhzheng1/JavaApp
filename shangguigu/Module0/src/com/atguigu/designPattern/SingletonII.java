package com.atguigu.designPattern;

public class SingletonII {
    private SingletonII(){}

    private static SingletonII instance = null;

    //如果未创建，则先创建
    public static SingletonII getInstance(){
        if(instance==null) instance = new SingletonII();
        return instance;
    }
}
