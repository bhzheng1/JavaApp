package com.atguigu.extend;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        this.height = 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findVolume(){
        return super.findArea() * height;
    }
}
