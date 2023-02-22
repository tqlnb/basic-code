package com.tql.test2;

public class Haskey extends Dog{
    @Override
    public void eat() {
        System.out.printf("一只叫%s的%d岁的哈士奇正在吃骨头并拆家",this.getName(),this.getAge());
    }
}
