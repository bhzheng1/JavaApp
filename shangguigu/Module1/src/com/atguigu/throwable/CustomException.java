package com.atguigu.throwable;

public class CustomException {
}
class BelowZeroException extends Exception {
    static final long serialVersionUID = -1918095006306724743L;
    public BelowZeroException(){
        super();
    }
    public BelowZeroException(String message){
        super(message);
    }
}