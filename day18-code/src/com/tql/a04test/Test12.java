package com.tql.a04test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        //把字符串变成整数
        Scanner sc = new Scanner(System.in);
        String strInt = sc.nextLine();
        int num = 0;
        for (int i = 0; i < strInt.length(); i++) {
            num = num *10 + strInt.charAt(i)-48;
        }
        System.out.println(num);
    }
}
