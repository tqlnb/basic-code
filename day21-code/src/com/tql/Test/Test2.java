package com.tql.Test;

public class Test2 {
    public static void main(String[] args) {
        //不死神兔-斐波那契数列

        System.out.println(getSum(12));
    }
    public static int getSum(int month){
        if (month == 1 || month == 2){
            //递归出口
            return 1;
        } else if (month > 2) {
            return getSum(month - 1) + getSum(month -2);
        }else {
            return 0;
        }
    }
}
