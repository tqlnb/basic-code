package com.tql.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘录入两个数字，表示一个范围，统计这个范围中既能被3整除又能被5整除的数有多少个

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0,count = 0;
        //使b为较大的数
        if(a<b){
            c = a ;
            a = b;
            b = c;
        }
        //循环判断
        for(int i=b;i<=a;i++){
            if(i%3==0 && i%5==0) {
                count++;
                System.out.println("第"+count+"个数是："+ i);
            }
        }
        System.out.println("共有"+count+"个数");
    }
}
