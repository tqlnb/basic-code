package com.tql.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
//        zouchang(3,5);
        int a =sum(6,7);
        System.out.println(a);
    }

    public  static void zouchang(int chang,int kuan){
        int zou = 2*(chang+kuan);
        System.out.println(zou);
    }
    public static int sum(int a , int b){
        int summer = a + b;
        return summer;
    }
}
