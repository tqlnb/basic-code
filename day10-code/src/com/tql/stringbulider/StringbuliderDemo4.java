package com.tql.stringbulider;

import java.util.Scanner;

public class StringbuliderDemo4 {
    //使用StringBulider的场景
    //1.字符串的拼接
    //2.字符串的反转
    public static void main(String[] args) {
        //判断对称字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();

        StringBuilder sb =new StringBuilder();
        sb.append(str1);

        String str2 = sb.reverse().toString();
        System.out.println(str1.equals(str2));
    }
}
