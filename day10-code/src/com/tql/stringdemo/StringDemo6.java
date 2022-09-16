package com.tql.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //统计字符次数
        //统计字符串 里 大小写字母和数字次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int bigCount = 0, smallCount = 0, numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                bigCount ++;
            } else if ( c >= 'a' && c <= 'z') {
                smallCount ++;
            }else if (c >= '0' && c<= '9') {
                numberCount ++;
            }else {
                System.out.println("存在非法字符");
                return;
            }
        }
        System.out.println("大写字母"+bigCount+"位，小写字母"+smallCount+"位，数字"+numberCount+"位");
    }
}
