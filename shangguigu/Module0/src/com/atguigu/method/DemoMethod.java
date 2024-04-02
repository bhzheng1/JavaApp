package com.atguigu.method;

public class DemoMethod {
    public static void main(String[] args){
        System.out.println("hello world!");
        System.out.println(sum(2, 3));
        method01();
        int result = method02("abc");
    }

    private static int method02(String s) {
        System.out.println(s);
        return 0;
    }

    public static void method01() {

    }

    public static int sum(int a, int b){
        return a+b;
    }
}
