package com.tql.test44;

import java.util.Random;

public class Thread44 extends Thread{

    //共享数据
    static double money = 100;
    //三个包
    static int count = 3;

    //最小的中奖金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (Thread44.class){
            if(count == 0){
                System.out.println(getName() + "没抢到");
            }else {
                double prize = 0;
                if(count == 1){
                    //表示最后一个红包
                    prize = money;
                }else {
                    //不是最后一次的情况
                    //随机
                    Random r = new Random();
                    double bounds = money - MIN * (count - 1);
                    prize = r.nextDouble(bounds - MIN) + MIN;
                }
                money -= prize;
                count --;
                System.out.println(getName() + prize +"剩"+ money);
            }
        }
    }
}
