package com.tql.array;

import java.util.Random;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //生成随机数组
        int [] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100)+1;
            arr[i] = number;
        }
        for (int i : arr) {
            System.out.println(i);
        }

        //求和
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("数组和为"+sum);

        //平均数
        int ave =sum / arr.length;
        System.out.println("数组平均数为"+ave);

        //统计多少数比平均值小
        int sum1 =0;
        for (int i : arr) {
            if(i < ave)
                sum1 ++;
        }
        System.out.println("有"+sum1+"个数比平均值小");
    }
}
