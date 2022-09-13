package com.tql.test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取个位，十位，百位

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        //获取个十百位
        int ge = number%10;
        int shi = number/10%10;
        int bai = number/100;

        //输出
        System.out.println("个位\t：\t"+ge);
        System.out.println("十位\t：\t"+shi);
        System.out.println("百位\t：\t"+bai);
    }
}
