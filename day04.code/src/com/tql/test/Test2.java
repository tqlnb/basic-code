package com.tql.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();
        switch (week){
            case 1,2,3,4,5 :
                System.out.println("工作日");
                break;
            case 6,7 :
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
