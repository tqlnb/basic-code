package com.tql.a08innerclassdemo2;

public class Outer {
    private int a = 10;

    class Inner{
        int a = 20;
        public void show(){
            System.out.println(Outer.this.a);   //10
            System.out.println(this.a);         //20
            System.out.println(a);              //30
        }
    }
}
