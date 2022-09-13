package com.tql.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        // +=
        int a = 10;
        int b = 20;
        a += b;
        System.out.println("a="+a);
        System.out.println("b="+b);

        //细节
        short s = 1;
        s += 1;         //左边右边相加，得到2，再赋值给左边的变量  等同于 s = （short）(s + 1);
        // += -= *= /= %= 底层都隐藏了强制类型转换
        System.out.println(s);
    }
}
