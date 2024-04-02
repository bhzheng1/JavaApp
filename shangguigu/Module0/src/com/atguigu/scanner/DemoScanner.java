package com.atguigu.scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int dataInt = sc.nextInt();
        String dataStr = sc.next();
        String dataStr1 = sc.nextLine();
        System.out.println("data: " + dataInt);
        System.out.println("data: " + dataStr);
        System.out.println("data: " + dataStr1);
    }
}
