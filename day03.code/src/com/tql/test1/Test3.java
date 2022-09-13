package com.tql.test1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = a==6 || b==6 || (a+b)%6==0;
        System.out.println(result);
    }
}
