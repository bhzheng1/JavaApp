package com.atguigu.synchronizedDemo;

public class Test0 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 = new Thread(myTicket, "t1");
        Thread t2 = new Thread(myTicket, "t2");
        Thread t3 = new Thread(myTicket, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
