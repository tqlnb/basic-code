package com.tql.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //定义学生工具类
        //需求:定义一个集合，用于存储3个学生对象。学生类的属性为:name、age.gender
        //定义一个工具类，用于获取集合中最大学生的年龄。
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三",11,"男");
        Student stu2 = new Student("李四",12,"男");
        Student stu3 = new Student("王五",13,"女");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAge);

    }
}
