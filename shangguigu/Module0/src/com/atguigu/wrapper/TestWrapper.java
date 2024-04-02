package com.atguigu.wrapper;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestWrapper {
    @Test
    public void test1() {

        //int的包装类
        Integer a = 1111;
        System.out.println(a);

        //泛型类不能用基本类型
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(a);
        for (Integer i : al) {
            System.out.println(i);
        }
    }
}
