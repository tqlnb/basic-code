package com.tql.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的钱");
        int money = sc.nextInt();
        if(money >= 100){
            System.out.println("网红餐厅");
        }else{
            System.out.println("沙县小吃");
        }
    }
}
