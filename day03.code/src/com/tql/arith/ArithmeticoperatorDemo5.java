package com.tql.arith;

public class ArithmeticoperatorDemo5 {
    public static void main(String[] args) {
        //++和--
        int a = 10,c = 10;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        //后++：先用后加
        int b = a++;
        System.out.println("b="+ b + "\ta=" +a );
        //先++：先加后用
        int d = ++c;
        System.out.println("c="+ c + "\td=" + d );
    }
}
