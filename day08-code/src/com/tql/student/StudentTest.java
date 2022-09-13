package com.tql.student;

public class StudentTest {
    public static void main(String[] args) {
        //使用带参构造
        Student s = new Student("tql",22);
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
