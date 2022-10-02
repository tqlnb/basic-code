package com.tql.a02polymorphismdemo2;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+
                "颜色的猫咪眯着眼睛侧头吃" +something);

    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }

}
