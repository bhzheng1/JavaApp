package com.atguigu.notSafeThreadDemo;

public class MyTicket implements Runnable {
    // define 100 tickets for sale
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ": buy" + " " + ticket + " ticket!");
                ticket--;
            } else {
                break;
            }
        }
    }
}
