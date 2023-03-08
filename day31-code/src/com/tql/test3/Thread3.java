package com.tql.test3;

public class Thread3 extends Thread{
    static int number = 100;

    @Override
    public void run() {
        while (true){
            synchronized (Thread3.class){
                if (number == 0){
                    break;
                }else {
                    if(number % 2 == 1){
                        try {
                            sleep(30);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(getName()+"->"+number);
                    }
                    number --;
                }
            }
        }
    }
}
