package com.tql.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String jia = "2023年11月11日 0:01:00";
        String pi = "2023年11月11日 0:11:0";
        Date jiaDate = sdf1.parse(jia);
        Date piDate = sdf1.parse(pi);
        System.out.println(CatchTime(jiaDate)+"小贾");
        System.out.println(CatchTime(piDate)+"小皮");

    }
    public static boolean CatchTime(Date date) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String begin = "2023年11月11日 0:00:00";
        String end = "2023年11月11日 0:10:00";
        Date beginDate = sdf1.parse(begin);
        Date endDate = sdf1.parse(end);
        return date.getTime() >= beginDate.getTime() && date.getTime() <= endDate.getTime();
    }
}
