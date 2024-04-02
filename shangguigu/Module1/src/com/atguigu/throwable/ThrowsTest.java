package com.atguigu.throwable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
    public void method1() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");//肯能失败
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();
        }
        fis.close();

    }

    public void method2(){
        try{
            this.method1();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
