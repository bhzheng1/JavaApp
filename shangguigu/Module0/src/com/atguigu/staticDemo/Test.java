package com.atguigu.staticDemo;

public class Test {
    public static void main(String[] args){
        Chinese c1 = new Chinese();
        c1.name = "C1";
        Chinese.nation = "CHN";
        Chinese.show();
        c1.method();
    }
}
