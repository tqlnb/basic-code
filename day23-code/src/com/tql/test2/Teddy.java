package com.tql.test2;

public class Teddy extends Dog{
    @Override
    public void eat() {
        System.out.printf("一只叫%s的%d岁的泰迪正在吃骨头",this.getName(),this.getAge());
    }
}
