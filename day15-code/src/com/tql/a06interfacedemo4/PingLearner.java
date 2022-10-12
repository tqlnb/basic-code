package com.tql.a06interfacedemo4;

public class PingLearner extends Person implements InterLearn{
    public PingLearner() {
    }

    public PingLearner(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学乒乓");
    }
}
