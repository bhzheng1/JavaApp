package com.atguigu.throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {
    public static void main(String[] args) {
        Father f = new Child();
        try{
            f.method1(); // 编译为父类方法，执行为子类方法
        }
        catch (IOException e) // 异常必须自洽
        {
            e.printStackTrace();
        }
    }

}

class Father{
    public void method1() throws IOException{}
}
class Child extends Father{
    @Override
    public void method1() throws FileNotFoundException{}//为了逻辑自洽，子类异常必须小于父类异常
}
