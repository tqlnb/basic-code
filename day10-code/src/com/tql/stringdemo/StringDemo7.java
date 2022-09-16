package com.tql.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        //拼接字符串
        int [] arr = {1,2,3,4,5,6,7,8};
        String str = "[";
        for (int i = 0; i < arr.length-1; i++) {
            str = str + arr[i] +",";
        }
        str = str + arr[arr.length-1]+']';
        System.out.println(str);
    }
}
