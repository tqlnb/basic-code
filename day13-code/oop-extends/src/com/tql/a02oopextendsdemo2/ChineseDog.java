package com.tql.a02oopextendsdemo2;

public class ChineseDog extends Dog{
    //父类中的方法不能满足我们的需求了，所以需要进行重写
    //而且中华田园犬完全用不到父类中的代码的，所以不需要通过super进行调用
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
