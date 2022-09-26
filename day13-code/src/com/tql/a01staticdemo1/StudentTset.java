package com.tql.a01staticdemo1;

public class  StudentTset {
    public static void main(String[] args) {


        Student.teachername = "阿伟老师";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(11);
        s1.setGender("男");
//        s1.teachername = "\u963F\u4F1F\u8001\u5E08";

        s1.study();
        s1.show();

        Student s2 =new Student();
        s2.setName("李四");
        s2.setAge(22);
        s2.setGender("女");

        s2.study();
        s2.show();

    }
}
