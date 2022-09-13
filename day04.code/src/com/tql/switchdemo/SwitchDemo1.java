package com.tql.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //default的位置和省略
        int number = 100;
        switch (number){
            case 1 :
                System.out.println("1");
                break;
            case 10 :
                System.out.println(10);
                break;
            case 20 :
                System.out.println(20);
                break;
            default:
                System.out.println("不是1、10、20");
                break;
        }
    }
}
