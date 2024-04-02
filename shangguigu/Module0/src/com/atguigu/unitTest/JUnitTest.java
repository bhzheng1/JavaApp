package com.atguigu.unitTest;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class JUnitTest {
    @Test
    public void test1(){
        System.out.println("hello");
    }

    int number = 10;

    @Test
    public void test2(){
        System.out.println("hello"+ number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number");
        int num = scanner.nextInt();
        System.out.println(num);
    }
}