package com.tql.test1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的值");
        int mycode = sc.nextInt();
        System.out.println("请输入你的值");
        int yourcode = sc.nextInt();
        // 比较
        boolean result = mycode > yourcode;
        System.out.println(result);
    }
}
