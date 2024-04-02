package com.atguigu.notSafeThreadDemo;

public class Test0 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        // t1, t2, t3 could buy a same ticket
        Thread t1 = new Thread(myTicket, "t1");
        Thread t2 = new Thread(myTicket, "t2");
        Thread t3 = new Thread(myTicket, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
    
}
