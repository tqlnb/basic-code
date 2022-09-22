package com.tql.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();

        Student s1 =new Student("张三",22);
        Student s2 =new Student("李四",23);
        Student s3 =new Student("王五",24);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (Student student : list) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }

    }
}
