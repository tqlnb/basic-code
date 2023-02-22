package com.tql.test2;

public class Lihua extends Cat{

    @Override
    public void eat() {
        System.out.printf("一只叫%s的%d岁的狸花猫正在吃小饼干",this.getName(),this.getAge());
    }
}
