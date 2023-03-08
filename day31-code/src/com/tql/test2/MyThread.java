package com.tql.test2;

public class MyThread extends Thread{

    static int count = 100;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if(count < 10){
                    break;
                }else {
                    count -- ;
                    System.out.println(getName()+"送,剩下"+count+"份礼物");
                }
            }
        }
    }
}
