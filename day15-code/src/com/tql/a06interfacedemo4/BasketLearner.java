package com.tql.a06interfacedemo4;

public class BasketLearner extends Person implements InterLearn{
    public BasketLearner() {
    }

    public BasketLearner(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学篮球");
    }
}
