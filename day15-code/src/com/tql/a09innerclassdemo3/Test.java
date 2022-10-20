package com.tql.a09innerclassdemo3;

import com.tql.a03interfacedemo1.Swim;

public class Test {
    public static void main(String[] args) {
       /*
        需要大家理解匿名内部类的格式，而不是硬记:
            new类名或者接口名(){
            重写方法;
            };
        */
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳方法");
            }

        };

        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写的eat方法");
            }

        };

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );


    }

    public static void method(Animal a){
        a.eat();
    }
}
