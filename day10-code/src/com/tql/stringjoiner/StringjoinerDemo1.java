package com.tql.stringjoiner;

import java.util.StringJoiner;

public class StringjoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
    }
}
