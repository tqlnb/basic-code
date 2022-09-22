package com.tql.listdemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        System.out.print('[');
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+',');
        }
        System.out.println(list.get(list.size()-1)+']');
        //[111,222,333,444]
    }
}
