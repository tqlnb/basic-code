package com.tql.logicoperator;

import java.util.Scanner;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        //三元运算符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1 == number2 ? "相等" : "不等");
    }
}
