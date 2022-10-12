package com.tql.a07innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carClolor;

    public void show(){
        System.out.println(carName);
        Engine e =new Engine();
        System.out.println(e.engineAge);
        e.show();
    }

    //内部类
     class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
