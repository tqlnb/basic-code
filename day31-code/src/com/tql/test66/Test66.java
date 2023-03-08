package com.tql.test66;

import java.util.ArrayList;
import java.util.Collections;

public class Test66 {
    public static void main(String[] args) {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建线程
        Thread66 t1 = new Thread66(list);
        Thread66 t2 = new Thread66(list);

        t1.start();
        t2.start();
    }
}
