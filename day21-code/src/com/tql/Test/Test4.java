package com.tql.Test;

public class Test4 {
    public static void main(String[] args) {
        //爬楼梯
        //可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        // 如果这个楼梯有20个台阶，小明一共有多少种爬法呢?
        System.out.println(getWays(20));
    }
    public static int getWays(int step){
        if(step == 1 ){
            return 1;
        } else if (step == 2) {
            return 2;

        } else {
            return getWays(step -1) + getWays(step - 2) ;
        }
    }
}
