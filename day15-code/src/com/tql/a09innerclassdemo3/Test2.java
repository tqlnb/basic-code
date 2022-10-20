package com.tql.a09innerclassdemo3;

public class Test2 {
    public static void main(String[] args) {
        /*
        *
        *       new 类/接口(){
        *           重写的方法；
        *      }
        *
        *
        * */


        //接口多态
        Swim s = new Swim(){

            @Override
            public void Swim() {
                System.out.println("游泳");
            }
        };

        //编译看左边，运行看右边
        s.Swim();


        new Swim(){
            @Override
            public void Swim() {
                System.out.println("游泳2");
            }
        }.Swim();
    }
}
