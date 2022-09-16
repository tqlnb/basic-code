package com.tql.test;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "111";

        //new 构造方法
        //1. 空参构造
        String s2 = new String();
        System.out.println("@" + s2 + "!");


        //2.传递一个字符串，根据传递的字符串内容再创建一个新的字符串（脱裤子放屁）
        String s3 = new String("abc");


        //3.传递一个字符数组，根据数组的内容创建一个一个新的字符串对象
        //需求：我要修改字符串内容 abc -> Qbc
        char [] arr = {'a','b','c','d','e'};
        String s4 = new String(arr);
        System.out.println(s4);

        //4.传递一个字节数组，根据字节数组再创建一个字符串
        //应用场景 ：网络传输的数据都是字节信息
        //把字节信息转换成字符串
        byte [] bytes = {97,98,99,100};
        //对应的ascii码，找到对应的字符
        String s5 =new String(bytes);
        System.out.println(s5);
    }
}
