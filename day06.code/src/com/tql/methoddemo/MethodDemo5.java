package com.tql.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        compare(10,20);

    }

    public static void compare(int a, int b) {
        if (a == b)
            System.out.println("相同");
        else
            System.out.println("不同");
    }

    public static void compare(short a, short b) {
        if (a == b)
            System.out.println("相同");
        else
            System.out.println("不同");
    }
    public static void compare(long a, long b) {
        if (a == b)
            System.out.println("相同");
        else
            System.out.println("不同");
    }
    public static void compare(byte a, byte b) {
        if (a == b)
            System.out.println("相同");
        else
            System.out.println("不同");
    }

}
