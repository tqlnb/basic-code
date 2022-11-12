package com.tql.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //判断质数
        long begin = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int input = sc.nextInt();
        isPrime(input);
        long end = System.currentTimeMillis();
        //判断程序运行了多少毫秒
        System.out.println(end - begin +"毫秒");
    }

    private static void isPrime(int input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if(input % i == 0){
                System.out.println("不是质数");
                return;
            }
        }
        System.out.println("是质数");
    }
}
