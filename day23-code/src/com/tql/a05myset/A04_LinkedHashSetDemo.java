package com.tql.a05myset;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo {
    public static void main(String[] args) {
        //1.创建4个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);


        //2.创建集合的对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();


        //3.添加元素
        System.out.println(lhs.add(s3));    //true
        System.out.println(lhs.add(s2));    //true
        System.out.println(lhs.add(s1));    //true
        System.out.println(lhs.add(s4));    //false

        //4.打印集合
        System.out.println(lhs); //顺序打印
    }
}
