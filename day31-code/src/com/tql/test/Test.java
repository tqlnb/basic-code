package com.tql.test;

public class Test {
    public static void main(String[] args) {

        //创建线程对象
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        //开启线程
        cook.start();
        foodie.start();
    }
}
