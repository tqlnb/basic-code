package com.tql.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int c = sc.nextInt();
        int x = c;
        int num = 0;
        while (x != 0){
            //从右往左获取每一位数字
            int y = x%10;
            //x去掉最后一位
            x /= 10;
           //修改num
            num = num*10 + y;
        }
        if(c == num){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
