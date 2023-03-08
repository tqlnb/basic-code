package com.tql.test;

public class Desk {

    /*
    * 作用:控制生产者和消费者执行
    *
    *
    * */

    public static int foodFlag = 0;

    //总个数
    public static int count = 10 ;

    //锁对象
    public static Object lock = new Object();
}
