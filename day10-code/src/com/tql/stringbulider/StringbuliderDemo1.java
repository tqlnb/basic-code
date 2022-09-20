package com.tql.stringbulider;

public class StringbuliderDemo1 {
    public static void main(String[] args) {
        //string bulider
        //创建对象
        StringBuilder sb = new StringBuilder("abc");

        //添加元素
        sb.append(1);
        sb.append(2.2);
        sb.append(true);
        sb.append("tql");

        //反转
        sb.reverse();

        //获取长度
        int len = sb.length();
        System.out.println(len);


        //因为stringbulider是java写好的类
        //所以打印对象不是地址值而是属性值
        System.out.println(sb);

        String str = sb.toString();

        System.out.println(str);
    }
}
