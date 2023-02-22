package com.tql.test2;

public class Bosi extends Cat{
    @Override
    public void eat() {
        System.out.printf("一只叫%s的%d岁的波斯猫正在吃鱼",this.getName(),this.getAge());
    }
}
