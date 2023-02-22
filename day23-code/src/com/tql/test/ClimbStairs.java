package com.tql.test;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(getWays(20));
    }
    public static int getWays(int st){
        if(st == 1){
            return 1;
        } else if (st == 2) {
            return 2;
        }

        return getWays(st -1) +getWays(st - 2);
    }
}
