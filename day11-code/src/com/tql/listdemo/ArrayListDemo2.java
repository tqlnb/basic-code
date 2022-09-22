package com.tql.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //添加元素
        boolean result = list.add("aaa");
        System.out.println(result);         //true
        System.out.println(list);           //[aaa]
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);           //[aaa, bbb, ccc, ddd]

        //删除元素
        boolean res = list.remove("aaa");
        System.out.println(res);            //true
        System.out.println(list);           //[bbb, ccc, ddd]
        boolean res1 = list.remove("eee");
        System.out.println(res1);           //false

        String remove = list.remove(0);
        System.out.println(remove);         //bbb
        System.out.println(list);           //[ccc, ddd]

        //修改元素
        String result1 = list.set(1, "eee");
        System.out.println(result1);        //ddd
        System.out.println(list);           //[ccc, eee]

        //查询
        String s = list.get(0);
        System.out.println(s);              //ccc

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
