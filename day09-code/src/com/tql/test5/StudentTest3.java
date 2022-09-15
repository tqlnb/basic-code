package com.tql.test5;

public class StudentTest3 {
    public static void main(String[] args) {
        Student [] arr = new Student[3];
        Student stu1 = new Student(1,"张三",23);
        Student stu2 = new Student(2,"李四",24);
        Student stu3 = new Student(3,"王五",25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getIndex(arr,2);

        if(index >= 0){
            arr[index].setAge(arr[index].getAge()+1);
            printArr(arr);
        }else{
            System.out.println("当前id不存在");
        }


    }

    public static int getIndex(Student [] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if (arr[i].getId() == id )
                    return i;
            }
        }
        return -1;
    }

    public static  void printArr(Student [] arr){
        for (Student student : arr) {
            if(student != null) {
                System.out.println(student.getId()+","+student.getName()+","+student.getAge());
            }
        }
    }


}
