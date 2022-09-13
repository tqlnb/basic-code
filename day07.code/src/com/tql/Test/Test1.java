package com.tql.Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //计算机票价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        int money = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入舱，0表示头等舱，1表示经济舱");
        int chang = sc.nextInt();
//        System.out.println("机票价格为："+getmoney(money,month,chang)+"元");
        int mm = 0;
        if (month >= 5 && month <= 10){
            if(chang == 0)
                mm = (int)(money *0.9);
            else if (chang == 1) {
                mm = (int)(money *0.85);
            }else
                System.out.println("非法舱位");
        }else if(month >=11 && month <= 12 || month >= 1 && month <=4){
            if(chang == 0)
                mm = (int)(money *0.7);
            else if (chang == 1) {
                mm = (int)(money *0.65);
            }else
                System.out.println("非法舱位");
        }else{
            System.out.println("非法月份");
        }
        if(mm != 0)
            System.out.println("机票的价格为"+mm+"元");
    }

    





    /*
    public static double getmoney(double money, int month,String chang){
        double i = 0;
        if( month >= 5 && month <= 10){
            if(chang == "头等舱")
                i = money * 0.9;
            else
                i = money * 0.85;
        } else {
            if(chang == "头等舱")
                i = money * 0.7;
            else
                i = money * 0.65;
        }
        return i ;
    }
*/
}
