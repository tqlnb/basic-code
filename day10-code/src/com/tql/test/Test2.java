package com.tql.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        // 要求1:长度为小于等于9
        // 要求2：只能是数字
        //将内容变成罗马数字
        //注意点:
        //罗马数字里面是没有0的
        //如果键盘录入的数字包含0，可以变成””(长度为0的字符串)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串，长度小于等于9，只能是数字");
        String str = sc.next();
        if(str.length() > 9){
            System.out.println("字符串过长，程序结束");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<48 || str.charAt(i)>57){
                System.out.println("不是数字，程序结束");
                return;
            }
        }
        char [] arr = {' ','Ⅰ','Ⅱ','Ⅲ','Ⅳ','Ⅴ','Ⅵ','Ⅶ','Ⅷ','Ⅸ'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int i1 = str.charAt(i) - 48;
            sb.append(arr[i1]);
        }
        String str1 = sb.toString();
        System.out.print("罗马数字为：");
        System.out.println(str1);
    }
}
