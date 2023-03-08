package com.tql.test1run;

public class MyRun implements Runnable{
    int count = 100;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(count == 0 ){
                    break;
                }else {
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count --;
                    System.out.println(Thread.currentThread().getName()+"卖了一张票,还剩"+count+"张票");
                }
            }
        }
    }
}
