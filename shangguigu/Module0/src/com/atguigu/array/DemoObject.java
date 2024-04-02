package com.atguigu.array;

public class DemoObject {
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student("test1", 12);
        students[1] = new Student("test2", 20);
        students[2] = new Student("test3", 23);
        for (Student s:students){
            System.out.println(s.getName());
            System.out.println(s.getScore());
        }
    }
}
