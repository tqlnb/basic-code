package com.tql.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("tql",22);
        Animal aDog = new Dog();
        aDog.setAge(2);
        aDog.setColor("白");

        p.keepPet(aDog ,"骨头");

        Animal aCat = new Cat();
        aCat.setAge(3);
        aCat.setColor("黑");
        p.keepPet(aCat ,"鱼");


    }
}
