package com.tql.a06interfacedemo4;

public class PingTeacher extends Person implements InterTeach,InterSpeakEnglish{
    public PingTeacher() {
    }

    public PingTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
