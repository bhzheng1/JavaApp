package com.atguigu.object;

import com.atguigu.access.Order;

public class Animal implements Cloneable {
    private String name;

    public Animal() {
        super();
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // run before this is destroyed, this method is deprecated
    @Override
    protected void finalize() throws Throwable {
        System.out.println("deleted: " + this);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Animal animal){
            return this.name.equals(animal.name);
        }
        return false;
    }
}
