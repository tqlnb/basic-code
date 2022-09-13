package com.tql.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //求算术平方根
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if( i*i > number) {
                System.out.println(i-1);
                break;
            }
        }
    }
}
