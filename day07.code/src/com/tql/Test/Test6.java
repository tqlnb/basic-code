package com.tql.Test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //数字加密
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字来加密");
        int number1 = sc.nextInt();
        //1. 把数字每个字符放到数组中
        //计算数组长度
        int count = 0;
        int temm = number1;
        while (temm != 0){
            temm /=10;
            count ++;
        }
        //定义数组，把数字存入
        int [] arr= new int[count];
        int temm2 = number1;
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = temm2 % 10;
            temm2 /=10;
        }

//        int [] arr = {1,9,8,3};
        //2.+5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        //3. %10
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
        //4.反转
        for (int i = 0,j= arr.length-1; i < j; i ++,j --) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int number2 = 0;
        for (int j : arr) {
            number2 = number2 * 10 + j;
        }
        System.out.println("加密结果为："+number2);

    }
}
