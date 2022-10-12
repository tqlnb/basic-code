package com.tql.a02abstract2;

public class Test {
    public static void main(String[] args) {
        Sheep s = new Sheep();
        s.setAge(11);
        s.setName("肖恩");
        s.eat();
        s.drink();

        Frog f = new Frog("绿绿",3);
        f.eat();
        f.drink();
    }
}
