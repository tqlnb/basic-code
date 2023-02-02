package com.tql.lambda;

public class LambdaDemo {
    public static void main(String[] args) {

        method(new Swim() {
            @Override
            public void swiming() {
                System.out.println("正在游泳");
            }
        });

        //利用lambda
        method(
                () ->{
                    System.out.println("游泳 啊");
                }
        );
    }

    public static void method(Swim s){
        s.swiming();
    }
}
