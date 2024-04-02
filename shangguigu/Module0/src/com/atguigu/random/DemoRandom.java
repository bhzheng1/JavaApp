package com.atguigu.random;

import java.util.Random;

public class DemoRandom
{
    public static void main(String[] args){
        Random rd = new Random();
        int data = rd.nextInt();
        System.out.println("data: " + data);
    }
}
