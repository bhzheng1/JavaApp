package com.atguigu.abstractDemo;

//abstract class 应用： 模版方法
//abstract class 中只有部分方法确定，剩余方法由child实现
abstract class TemplateMethod {
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("time: "+ (end - start));
    }

    public abstract void code();
}
