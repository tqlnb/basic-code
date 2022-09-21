package com.tql.stringbulider;

public class StringBuliderDemo6 {
    public static void main(String[] args) {
        //容量 长度
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abc");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijklmnopqrstuvwxyz");

        System.out.println(sb.capacity());
        System.out.println(sb.length());


        sb.append("0123456789");

        System.out.println(sb.capacity());
        System.out.println(sb.length());


    }
}
