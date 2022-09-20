package com.tql.stringbulider;

import java.util.Scanner;

public class StringbuliderDemo2 {
    public static void main(String[] args) {
        //链式编程
        //再调用一个方法后可以不用接受他的变量而可以继续调用其他方法
        int length = getString().substring(2).replace("a", "j").length();
        System.out.println(length);
    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;

    }
}
