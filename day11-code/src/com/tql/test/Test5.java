package com.tql.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入第"+(i+1)+"个学生的姓名");
            s.setName(sc.next());
            System.out.println("请输入第"+(i+1)+"个学生的年龄");
            s.setAge(sc.nextInt());
            list.add(s);
        }
        for (Student student : list) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
    }
}
