package com.atguigu.threadDemo;

public class JoinDemo {
    public static void main(String[] args) {
        PrintNumber t1 = new PrintNumber();
        t1.setName("Thread-1");
        t1.start();

        Thread.currentThread().setName("Main Thread");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if (i == 20) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
