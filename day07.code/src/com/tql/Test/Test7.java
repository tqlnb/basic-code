package com.tql.Test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //密码解码
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要解码的密码");
        int number1 = sc.nextInt();
        //把数据存到字符串
        //获取长度
        int temp = number1;
        byte count = 0;
        while (temp != 0){
            temp /= 10;
            count ++;
        }
        int [] arr = new int[count];
        //存入
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = number1 % 10;
            number1 /= 10;
        }
        //反转
        for (int i = 0, j=arr.length-1 ; i < j ; i++ , j--) {
            int temper = arr[i];
            arr[i] = arr[j];
            arr[j] = temper;
        }
        // 回%10
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>= 0 && arr[i] <= 5)
                arr[i] += 10;
            else if (arr[i]>5 && arr[i]<10) {

            }
            else{
                System.out.println("非法字符");
                return;
            }
        }
        // -5
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        //放回数据
        int number2 = 0;
        for (int i : arr) {
            number2 =number2*10 +i;
        }
        System.out.println("解码后密码为："+number2);
    }
}
