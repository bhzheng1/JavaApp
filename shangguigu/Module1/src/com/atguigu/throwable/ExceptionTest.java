package com.atguigu.throwable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    public void test() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");//肯能失败
            fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //即使try 或catch有return，finally也会被执行
            System.out.println("file read finished");
            try {
                if (fis != null) fis.close(); //必须手动关闭
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("exception catched");
    }
}
