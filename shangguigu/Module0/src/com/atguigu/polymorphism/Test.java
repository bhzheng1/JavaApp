package com.atguigu.polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Man();
        Man m1 = new Man();
        Woman w1 = new Woman();

        //方法编译看左，运行看右
        p1.eat();
        m1.eat();

        //多态性只适用于方法，不适用于属性
        //只会打印出左边的id
        System.out.println(p1.id);
        System.out.println(m1.id);

        //多态应用
        Test test = new Test();
        test.run(m1);
        test.run(w1);

        //向下转型
        //所有子实例都是父类的实例
        if(p1 instanceof Man){
            ((Man) p1).earnMoney();
        }
    }

    public void run(Person person){
        person.run();
    }
}
