package com.atguigu.extend;

public class Student extends Person{
    String school;
    int id;
    public void study() {
        System.out.println("study");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Student eat");
    }

    @Override
    public void sleep(){
        System.out.println("Student Sleep");
    }

    //任何子类的构造器，都会直接或间接的调用父类的构造器
    public Student()
    {
        //默认调用super()
        System.out.println("Student ctor");
    }

    public Student(String name){
        super(name); //可以直接调用父类
        System.out.println("Student name ctor");
    }
    public Student(String name, String school){
        this(name); //调用子类，然后间接调用父类的构造器
        this.school= school;
        System.out.println("Student this");
    }
}
