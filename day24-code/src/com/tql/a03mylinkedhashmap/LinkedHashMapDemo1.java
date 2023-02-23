package com.tql.a03mylinkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        //创建集合
        LinkedHashMap<String , Integer> lhm =new LinkedHashMap<>();
        //添加元素
        lhm.put("c",789);
        lhm.put("b",456);
        lhm.put("a",123);
        lhm.put("a",111);

        System.out.println(lhm);    //{c=789, b=456, a=111}
    }
}
