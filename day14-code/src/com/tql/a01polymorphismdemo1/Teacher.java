package com.tql.a01polymorphismdemo1;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师信息为"+getName() + getAge());
    }
}
