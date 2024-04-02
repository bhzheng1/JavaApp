package com.atguigu.throwable;

public class ThrowTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.register(-10);
    }
}

class Student {
    int id;

    public void register(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new RuntimeException("invalid id");
        }
    }

    public void register1(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            throw new Exception("invalid id");
        }
    }
}