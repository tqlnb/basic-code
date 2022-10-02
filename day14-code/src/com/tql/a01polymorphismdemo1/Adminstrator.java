package com.tql.a01polymorphismdemo1;

public class Adminstrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员信息为"+getName() + getAge());

    }
}
