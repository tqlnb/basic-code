package com.tql.test3;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("zhangsan",23,90.1,99,50);
        Student s2 = new Student("lisi",24,90,98,50);
        Student s3 = new Student("wangwu",25,95,100,30);
        Student s4 = new Student("zhaoliu",26,60,99,70);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
