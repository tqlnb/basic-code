package com.tql.test5;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student [] arr = new Student[3];
        Student stu1 = new Student(1,"张三",23);
        Student stu2 = new Student(2,"李四",24);
        Student stu3 = new Student(3,"王五",25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4,"赵六",22);

        Scanner sc = new Scanner(System.in );
        //唯一型判断
        System.out.println("请输入学生的id");
        int id = sc.nextInt();
        boolean flag =contains(arr , id);
        while (true){
        if (flag){
            System.out.println("当前id 重复，请修改id后添加");
            id =sc.nextInt();
            flag = contains(arr,id);
        }else {
            //添加进数组
            //把stu4保存到数组中
            //1. 数组存满了，创建一个新数组，长度= 老数组+1
            //2.数组没存满，直接添加
            int count = getcount(arr);
            if (count == arr.length) {
                //已经存满
                Student[] newArr = creatNewArr(arr);
                newArr[arr.length] = stu4;
                printArr(newArr);
                break;
            } else {
                //没有存满
                arr[count] = stu4;
                printArr(arr);
                break;
            }
        }

        }




    }
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null ){
                if(arr[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    //判断数组中存了几个元素
    public static int getcount(Student [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != null )
                count ++;
        }
        return count;

    }

    public static Student [] creatNewArr(Student [] arr){
        Student [] newArr =new Student [arr.length+1];
        /*
            newArr[i].setId(arr[i].getId());
            newArr[i].setName(arr[i].getName());
            newArr[i].setAge(arr[i].getAge());
*/
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    public static  void printArr(Student [] arr){
        for (Student student : arr) {
            if(student != null) {
                System.out.println(student.getId()+","+student.getName()+","+student.getAge());
            }
        }
    }


}
