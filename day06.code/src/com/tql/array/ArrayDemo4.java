package com.tql.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //动态初始化
        String [] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        for (String s : arr) {
            System.out.println(s);
        }

        //默认初始化
        //整数类型 默认初始化值 0
        //小数类型 默认初始化值 0.0
        //字符类型 默认初始化值 '/u0000' 空格
        //布尔类型 默认初始化值 false
        //引用数据类型 默认初始化值 null

    }
}
