package com.atguigu.finalDemo;

public class FinalDemo {
    final int MAX_SCORE = 100;
    final int MIN_SCORE;

    public FinalDemo() {
        MIN_SCORE = 0;
    }

    public void method() {
        final int num = 1000;
        System.out.println(num);
    }

    public void method(final int num) {
        System.out.println(num);
    }

    public static final float PI = 3.1415926F;
}
