package com.tql.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //求商和余数
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int beichu = sc.nextInt();
        System.out.println("请输入除数");
        int chu =sc.nextInt();
        int count = 0;
        while(beichu >= 0){
            beichu -= chu;
            count ++;
        }
        if(beichu != 0) {
            count -= 1;
            beichu += chu;
        }
        System.out.println("商是"+count+"  余数是"+beichu);
    }
}
