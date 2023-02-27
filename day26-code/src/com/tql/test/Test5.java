package com.tql.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list ,
                "zhangsan 23" , "lisi 24" , "wangwu 25");
        Map<String, Integer> newMap = list.stream()
                .filter(s -> Integer.parseInt(s.split(" ")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(" ")[0]
                        ,
                         s -> Integer.parseInt(s.split(" ")[1])
                ));
        System.out.println(newMap);
    }
}
