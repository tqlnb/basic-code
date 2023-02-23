package com.tql.a04mytreemap;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student , String > tm = new TreeMap<>();
        Student s1 = new Student( 23, "zhangsan");
        Student s2 = new Student( 26, "lisi");
        Student s3 = new Student( 25 , "wangwu");
        tm.put(s1, "江苏");
        tm.put(s2, "天津");
        tm.put(s3, "北京");

        System.out.println(tm);
    }
}
