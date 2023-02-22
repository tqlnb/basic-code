package com.tql.Test;

public class Main {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(climbStairs(n));
    }
}
