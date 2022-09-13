package com.tql.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //猜随机数
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int i = r.nextInt(100);
        int baodi = 0;
        while (true){
            System.out.println("请输入一个正整数");
            int number = sc.nextInt();
            baodi ++;
            if (baodi == 5){
                System.out.println("对了");
                break;
            }
            if(number > i){
                System.out.println("大了");
            } else if (number ==i) {
                System.out.println("对了");
                break;
            }else {
                System.out.println("小了");
            }
        }
    }
}
