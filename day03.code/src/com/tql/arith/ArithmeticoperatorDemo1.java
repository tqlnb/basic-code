package com.tql.arith;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3+2);
        //-
        System.out.println(5-3);
        //*
        System.out.println(7*9);
        //除
        System.out.println(66/5);
        //如果有小数参与,结果有可能是不精确的
        System.out.println(1.1+1.01);  //2.1100000000000003
        System.out.println(1.1-1.01);   //0.09000000000000008
        System.out.println(1.1*1.01);   //1.1110000000000002
        System.out.println(1/3.0+2/3.0);
    }
}
