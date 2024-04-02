package com.atguigu.synchronizedDemo;

public class MyTicket implements Runnable {
    // define 100 tickets for sale
    int ticket = 100;

    // new an object as lock
    final Object object = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (object) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ": buy" + " " + ticket + " ticket!");
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
