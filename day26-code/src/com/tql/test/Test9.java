package com.tql.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        /*需求：
        集合中有一些名字，按照要求过滤数据
        数据："张无忌","周芷若","赵敏","张强","张三丰"
        要求：只要以张开头，而且名字是3个字的
         */

        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        List<String> newList = list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());


    }
}
