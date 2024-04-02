package com.atguigu.object;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal("test");
        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("a1: " + a1);
            System.out.println("a2: " + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //finalize
        a1 = null; //a1的对象实体被释放, 但不确定什么时候释放
        System.gc(); //强制释放空间，也不确定什么时候释放
        try {
            Thread.sleep(1000);//Thread延时结束
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //equal
        //自定义的类，在没有重写equals()方法时，会调用Object的equals方法
        Animal aa = new Animal("test");
        Animal ab = new Animal("test");
        System.out.println(aa.equals(ab));
        System.out.println(aa.toString());
    }
}
