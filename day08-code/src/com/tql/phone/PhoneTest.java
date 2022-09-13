package com.tql.phone;

public class PhoneTest {

    public static void main(String[] args) {

        //创建手机的对象
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999.99;

        //获取手机对象的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机的方法
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 9999.99;
        p2.call();
        p2.playGame();
    }
}
