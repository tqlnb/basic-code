package com.tql.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
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
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break looper;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Student s = new Student();
        Scanner sc =new Scanner(System.in);
        while(true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            if (contains(list, id)) {
                System.out.println("id存在，请重新输入");
            } else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名");
        s.setName(sc.next());
        System.out.println("请输入学生年龄");
        s.setAge(sc.nextInt());
        System.out.println("请输入学生家庭住址");
        s.setAddress(sc.next());
        list.add(s);
        System.out.println("添加成功");
    }


    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的id");
        String id =sc.next();
        if(contains(list,id)){
            Student remove = list.remove(getIndex(list, id));
            System.out.println("删除成功，删除的是ID为"+remove.getId()+"的学生");
        }else{
            System.out.println("id不存在，请确认后再删除");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){

    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }else {
            System.out.println("id" + '\t' + '\t' + "姓名" + '\t' + "年龄" + '\t' + "家庭住址");
            for (Student student : list) {
                System.out.print(student.getId()  + '\t');
                System.out.print(student.getName() + '\t');
                System.out.print(student.getAge() + "\t"+"\t");
                System.out.println(student.getAddress());
            }
        }
    }

    //判断id是否存在
    public static boolean contains(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    //通过id获取索引
    public static int getIndex(ArrayList<Student> list,String id){
        int count = 0;
        for (Student stu : list) {
            if(stu.getId().equals(id)){
                return count;
            }
            count ++;
        }
        return -1;
    }
}
