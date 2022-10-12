package com.tql.a03interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青",2);
        System.out.println(f.getName()+","+f.getAge());
        f.eat();
        f.swim();

    }

}
