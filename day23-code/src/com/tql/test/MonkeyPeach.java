package com.tql.test;

public class MonkeyPeach {
    public static void main(String[] args) {
        System.out.println(getPeach(10));
    }

    public static int getPeach(int day){
        //递归出口
        if(day == 1){
            return 1;
        } else if (day <= 0) {
            System.out.println("当前时间错误");
            return -1;
        }
        //递归规则
        return (getPeach(day -1) + 1) * 2;
    }
}
