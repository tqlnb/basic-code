package com.tql.test;

public class Foodie extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0 ){
                    //3.判断共享数据是否到了末尾(到了末尾)
                    break;
                }else {
                    //4.判断共享数据是否到了末尾(没到末尾,执行核心逻辑)
                    //判断桌子上是否有面条

                    if(Desk.foodFlag == 0){
                        //没有,等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //有,开吃
                        //吃的总数减一
                        Desk.count -- ;
                        System.out.println("吃,还能再吃"+Desk.count+"碗");
                        //吃完唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //改变桌子的状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
