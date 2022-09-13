package com.tql.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // &&
        System.out.println(true&false && false|true);
        // ||
        System.out.println(true&false || false|true);


        //短路逻辑运算符有短路效果
        //当左边的表达式能确定结果，就不会运行右边的表达式
        int a=10,b=10;
        boolean result = ++a<5 && ++b>5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
