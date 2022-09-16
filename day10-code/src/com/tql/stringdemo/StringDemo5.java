package com.tql.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //遍历字符串
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
