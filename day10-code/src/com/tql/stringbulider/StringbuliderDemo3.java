package com.tql.stringbulider;

public class StringbuliderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").append("bbb").append("ccc");
        String s = sb.toString();
        System.out.println(s);
    }
}
