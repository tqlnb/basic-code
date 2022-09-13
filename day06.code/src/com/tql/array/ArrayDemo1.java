package com.tql.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // int
        int [] arr1 = new int[]{11, 22, 33};
        int [] arr2 = {11,12,13,14};
        // string
        String [] arr3 = new String[]{"zhangsan","lisi","wangwu"};
        // double
        double [] arr4 = {1.22,2.33,3.44};
        System.out.println(arr1);       //[I@776ec8df  地址值


        //[ : 表示是一个数组
        //I : 表示是int类型
        //@ : 固定格式
        //776ec8df : 地址（8位16进制）
        
    }
}

