package com.tql.a04objectdemo;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("tt",10);
        //2.克隆对象
        //细节;
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去。
        // 书写细节:
        //1.重写object中的clone方法
        // 2.让javabean类实现cloneable接口
        // 3.创建原对象并调用clone就可以了。
        //Student s2 = (Student) s1.clone();
/*
        System.out.println(s1);     //Student{name='tt', age=10}
        System.out.println(s2);     //Student{name='tt', age=10}
*/

        //第三方克隆工具实现深克隆
        Gson gson = new Gson();
        //把对象变成一个字符串
        String s = gson.toJson(s1);
        //再把字符串变回对象即可
        Student s2 = gson.fromJson(s, Student.class);

        System.out.println(s2);


    }
}
