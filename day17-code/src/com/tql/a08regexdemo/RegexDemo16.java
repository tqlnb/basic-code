package com.tql.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo16 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        Pattern p = Pattern.compile("[Jj]ava\\d{0,2}");
        Matcher m = p.matcher(str);
        boolean b = m.find();
        String s1 = m.group();
        System.out.println(s1);

        m.find();
        String s2 = m.group();
        System.out.println(s2);

        m.find();
        String s3 = m.group();
        System.out.println(s3);
    }
}
