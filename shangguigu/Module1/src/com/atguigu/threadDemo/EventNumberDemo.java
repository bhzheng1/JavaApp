//线程启动都是Thread类中定义的start
//创建的线程对象，都是thread类或其子类的实例
//建议使用实现runnable接口的方式，避免类的单继承的局限性
//Thread其实也是实现了runnable的类

package com.atguigu.threadDemo;

public class EventNumberDemo {
    public static void main(String[] args) {
        // 1
        PrintNumber t1 = new PrintNumber();
        t1.start();

        //2 接受Runnable实现类实例
        EvenNumber en = new EvenNumber();
        Thread t2 = new Thread(en);
        t2.start();

        //3 接受匿名实现Runnable类的实例
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        //4 匿名继承类
        (new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
    }
}

//Thread继承类可以直接调用start方法
class PrintNumber extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

// Runnable实现类通过传入Thread，来调用Thread的start方法
class EvenNumber implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

