package com.atguigu.access;

public class AccessTest {
    public void method(){
        Order order  = new Order();
        order.orderDefault = 1;
        order.orderProtected = 1;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
    }
}
