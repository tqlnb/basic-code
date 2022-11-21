package com.tql.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test14 {
    public static void main(String[] args) throws ParseException {
        String birthday = "2000年8月29日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birDate = sdf.parse(birthday);
        Date date = new Date();
        long day = (date.getTime() - birDate.getTime()) / 1000 / 60 / 60 / 24;
        System.out.println(day);

    }
}
