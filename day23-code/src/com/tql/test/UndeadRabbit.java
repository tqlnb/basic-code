package com.tql.test;

public class UndeadRabbit {
    public static void main(String[] args) {
        System.out.println(getCount(12));
    }

    public static int getCount(int month){
        //递归出口
        if(month == 1 ||month == 2){
            return 1;
        }
        return getCount(month - 1) + getCount(month - 2);

    }
}


