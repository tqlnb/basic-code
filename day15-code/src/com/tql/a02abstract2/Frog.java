package com.tql.a02abstract2;

public class Frog extends Animal{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"在吃虫子");
    }
}
