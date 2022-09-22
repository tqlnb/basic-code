package com.tql.studentsystem;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        looper : while(true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.print("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> queryStudent();
                case "5" -> {
                    System.out.println("退出");
                    break looper;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(){

    }


    //删除学生
    public static void deleteStudent(){

    }

    //修改学生
    public static void updateStudent(){

    }

    //查询学生
    public static void queryStudent(){

    }



}
