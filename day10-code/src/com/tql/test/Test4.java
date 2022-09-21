package com.tql.test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //键盘录入字符串，打乱其中的内容
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            int i1 = r.nextInt(arr.length);
            arr[i] = arr [i1];
            arr[i1] = temp;
        }
        String newStr = new String(arr);
        System.out.println(newStr);
    }
}
