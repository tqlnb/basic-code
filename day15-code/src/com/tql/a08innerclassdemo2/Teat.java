package com.tql.a08innerclassdemo2;

public class Teat {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
