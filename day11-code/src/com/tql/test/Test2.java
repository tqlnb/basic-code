package com.tql.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //基本数据类型 -> 包装类 -> 集合
        ArrayList <Integer> list = new ArrayList<>();

        //JDK5以后int和Integer类型是可以互相转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println(list.get(list.size()-1)+"]");
        //[1,2,3,4,5]
    }
}
