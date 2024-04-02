package com.atguigu.innerClass;

public class TestAnonymousClass {
    public static void main(String[] args) {
        //继承于Object的匿名类方法调用
        new Object() {
            public void method() {
                System.out.println("anonymous method");
            }
        }.method();

        //继承于abstract的匿名类方法调用
        AbstractClass abstractClass = new AbstractClass(){
            public void method(){
                System.out.println("abstract");
            }
        };
        abstractClass.method();
        System.out.println(abstractClass.getClass());
        System.out.println(abstractClass.getClass().getSuperclass());

        //继承于class的匿名子类方法调用
        ClassDemo classDemo = new ClassDemo(){
            //重写方法
            public void method(){
                System.out.println("class method override");
            }
        };
        classDemo.method();
        System.out.println(classDemo.getClass());
        System.out.println(classDemo.getClass().getSuperclass());

        //实现接口的匿名类
        InterfaceDemo interfaceDemo = new InterfaceDemo() {
            @Override
            public void method() {
                System.out.println("interface");
            }
        };
        interfaceDemo.method();
        System.out.println(interfaceDemo.getClass());
        System.out.println(interfaceDemo.getClass().getSuperclass());

        //
    }
}

interface InterfaceDemo{
    public void method();
}

abstract class AbstractClass {
    public abstract void method();
}

class ClassDemo {
    public void method(){
        System.out.println("class");
    }
}
