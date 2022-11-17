package com.tql.a08regexdemo;

public class RegexDemo15 {
    public static void main(String[] args) {
        String regex = "\\d{17}[xX\\d]";
        System.out.println("41080119930228457x".matches(regex));
        System.out.println("510801197609022309".matches(regex));
        System.out.println("15040119810705387X".matches(regex));
        System.out.println("130133197204039024".matches(regex));
        System.out.println("430102197606046442".matches(regex));

        String regex1 = "[1-9]\\d{16}[xX\\d]";
        System.out.println("41080119930228457x".matches(regex1));
        System.out.println("510801197609022309".matches(regex1));
        System.out.println("15040119810705387X".matches(regex1));
        System.out.println("130133197204039024".matches(regex1));
        System.out.println("430102197606046442".matches(regex1));

    }
}
