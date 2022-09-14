package com.tql.student;

public class Student {
    private String name;
    private int age;

    //如果没有写任何构造方法
    //虚拟机会自己加一个空构造方法

    public Student(){
        //空参构造
        System.out.println("看看我执行了吗");
        System.out.println();
    }

    public Student(String name,int age){
        //带参构造--对成员变量赋值
        this.name =name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =age;
    }
}
