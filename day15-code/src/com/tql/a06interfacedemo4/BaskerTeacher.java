package com.tql.a06interfacedemo4;

public class BaskerTeacher extends Person implements InterTeach,InterSpeakEnglish{
    public BaskerTeacher() {
    }

    public BaskerTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }
}
