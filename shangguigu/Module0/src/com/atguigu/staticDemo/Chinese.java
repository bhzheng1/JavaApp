package com.atguigu.staticDemo;

public class Chinese {
    // 静态方法和属性可以被继承，但不存在被重写。
    // 子类可以有同名方法，调用时只调用相关类但方法。
    // 静态方法也可以时private的
    static String nation;
    String name;
    int age;

    static void show() {
        System.out.println(String.format("Nation: %s", nation));
    }

    void method(){
        System.out.println("object method");
        show();
    }
}
