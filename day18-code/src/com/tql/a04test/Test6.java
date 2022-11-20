package com.tql.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) throws ParseException {
        String time = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf1.parse(time);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str = sdf2.format(d1);
        System.out.println(str);
    }
}
