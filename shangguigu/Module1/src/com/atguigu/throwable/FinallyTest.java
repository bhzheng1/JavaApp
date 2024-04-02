package com.atguigu.throwable;

public class FinallyTest {
    public static void main(String[] args) {
        System.out.println(test(10));
        System.out.println(test1(10));
    }
    public static int test(int num){
        try{
            return num;
        }
        catch(NumberFormatException e){
            return --num;
        }
        finally{
            System.out.println("done");
            //虽然num变化但是仍然返回原值
            ++num;
        }
    }
    public static int test1(int num){
        try{
            return num;
        }
        catch(NumberFormatException e){
            return --num;
        }
        finally{
            System.out.println("done");
            //finally 如果有返回值则会返回该值
            return ++num;
        }
    }
}
