package com.atguigu.innerClass;

public class TestInnerClass {
    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();
        dog.eat();
        Person person = new Person();
        Person.Bird bird = person.new Bird();
        bird.eat();
        bird.show("eagle");

    }
}

class Person {//外部类
    String name = "Person";
    int age;

    //静态的成员内部类
    static class Dog {
        public void eat() {
            System.out.println("person dog eat");
        }
    }

    //非静态的成员内部类
    class Bird {
        String name = "bird";

        public void eat() {
            System.out.println("person bird eat");
        }

        public void show(String name) {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
            this.eat();
            Person.this.eat();
        }
    }

    //返回一个接口类时，可以现场生成一个匿名类实例返回
    public Comparable method() {
        //局部内部类
        class InnerClass implements Comparable {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    public Person() {
        //局部内部类
        class InnerClass {
        }
    }

    public void eat() {
        System.out.println("person eat");
    }
}

