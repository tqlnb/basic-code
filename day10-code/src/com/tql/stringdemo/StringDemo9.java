package com.tql.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //金额转换
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = sc.nextInt();
        if(getByte(money) > 7 || getByte(money) < 0){
            System.out.println("金额超限，程序中止");
            return;
        }
        String str = change(money);
        System.out.println(str);

    }

    public static String change(int money){
        char [] number = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        //取money位数定义数组
        int [] moneyByte = new int[getByte(money)];
        int [] mmByte = new int[7];
        //取出每一位存入int数组
        for (int i = moneyByte.length-1; i >= 0; i--) {
            moneyByte[i] = money % 10;
            money /= 10;
        }
        //把int数组位数扩大至7位，低位补0
        for (int i = moneyByte.length-1,j = 6; i >= 0; i--,j--) {
            mmByte[j]= moneyByte[i];
        }
        //把int数组对应的汉字数字存入char数组
        char [] c =new char[7];
        for (int i = 0; i < c.length; i++) {
            c[i] = number[mmByte[i]];
        }
        //拼接
        String str = c[0]+"佰"+c[1]+"什"+c[2]+"万"+c[3]+"仟"+c[4]+"佰"+c[5]+"拾"+c[6]+"元";
        return str;
    }

    //判断int数组位数
    public static int getByte(int money){
        int count = 0;
        while(money != 0){
            money /= 10;
            count ++;
        }
        return count;
    }
}
