package com.tql.stringjoiner;

import java.util.StringJoiner;

public class StringjoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj =new StringJoiner("---","[","]");

        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();

        System.out.println(len);

        System.out.println(sj);

        String str = sj.toString();
        System.out.println(str);
    }
}
