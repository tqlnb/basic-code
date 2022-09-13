package com.tql.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        //定义一个数组，存入1-5，要求随机打乱数组中所有数的顺序

        int [] arr = {1,2,3,4,5};
        //如何获取数组中的随机索引
        Random r = new Random();


        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr [i];
            arr [i] = arr [randomIndex];
            arr [randomIndex] = temp ;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
