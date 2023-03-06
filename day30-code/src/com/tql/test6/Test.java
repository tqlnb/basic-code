package com.tql.test6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        //1.把文件中所有的学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("day30-code\\src\\com\\tql\\test6\\names.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("-");
            Student stu = new Student(arr[0] , arr[1] ,Integer.parseInt(arr[2]) ,Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //计算权重的总和
        double weight = 0;
        for (int i = 0; i < list.size(); i++) {
            weight += list.get(i).getWeight();
        }

        //计算每个人的实际占比
        double[] arr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).getWeight() / weight ;
        }

        //计算每个人权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }

        //随机抽取
        //获取一个0.0到1.1之间的随机数
        double number = Math.random();
        //判断number在arr中的位置
        //二分查找法
        //返回值: - 插入点索引 - 1
        int result = -Arrays.binarySearch(arr, number) - 1;

        Student stu = list.get(result);
        System.out.println(stu);

        //修改当前学生的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        //把集合的数据再写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("day30-code\\src\\com\\tql\\test6\\names.txt"));
        for (Student student : list) {
            bw.write(student.getName() +"-" + student.getGender() + "-" + student.getAge() + "-" + student.getWeight());
            bw.newLine();
        }
        bw.close();

    }
}
