package com.tql.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        Student s = new Student();
        s.setName("张三");
        s.setAge(11);
        register(s);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(12);
        register(t);

        Adminstrator a = new Adminstrator();
        a.setName("王五");
        a.setAge(13);
        register(a);


    }

    //这个方法既能接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register( Person p ){
        p.show();
    }
}
