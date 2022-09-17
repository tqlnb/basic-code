package com.tql.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //号码屏蔽
        String phoneNumber = "13112349468";

        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7);
        System.out.println(start+"****"+end);
    }
}
