package com.tql.stringdemo;

import java.util.Scanner;

public class Stringdemo8 {
    public static void main(String[] args) {
        //字符串反转
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String str1 = roll(str);
        System.out.println(str1);

    }

    public static String roll(String str){
        if(str == null){
            return "这是一个空字符串";
        }
        if(str.equals("")){
            return "";
        }
        char [] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        for (int i = 0,j=c.length-1; i < j; i++,j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return new String(c);
    }
}
