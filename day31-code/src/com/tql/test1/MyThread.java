package com.tql.test1;

public class MyThread extends Thread{

    static int count = 1000;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if(count == 0){
                    break;
                }else {
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count --;
                    System.out.println(getName()+"卖了一张票,还剩"+count+"张票");
                }
            }
        }
    }
}
