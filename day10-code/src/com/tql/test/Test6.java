package com.tql.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*给定两个以字符串形式表示的非负整数num1和num2，
        返回num1和num2的乘积，它们的乘积也表示为字符串形式。注意:需要用已有的知识完成。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数");
        int j = sc.nextInt();
        String multi = multi(i, j);
        System.out.println(multi);
    }
    public static String multi(int i,int j){
        int multi = i * j;
        StringBuilder sb =new StringBuilder();
        sb.append(multi);
        return sb.toString();
    }
}
