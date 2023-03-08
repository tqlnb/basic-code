package com.tql.test;

public class Cook extends Thread{

    @Override
    public void run() {
        /*
        * 1.循环
        * 2.同步代码块
        * 3.判断共享数据是否到了末尾(到了末尾)
        * 4.判断共享数据是否到了末尾(没到末尾,执行核心逻辑)
        *
        * */
        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    //3.判断共享数据是否到了末尾(到了末尾)
                    break;
                }else {
                    //4.判断共享数据是否到了末尾(没到末尾,执行核心逻辑)
                    if(Desk.foodFlag == 1){
                        //等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //做
                        System.out.println("做一碗饭");
                        //改变桌子状态
                        Desk.foodFlag = 1;
                        //唤醒消费者
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
