package com.tql.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //字符串比较
        String s1 =new String("abc");
        String s2 = "abc";
        String s3 ="Abc";

        System.out.println( s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        //忽略大小写
        System.out.println(s2.equalsIgnoreCase(s3));

    }
}
