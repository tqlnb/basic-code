package com.tql.Test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //抢红包 2 588 888 1000 10000

        int [] arr = {2,588,888,1000,10000};
        Random r =new Random();
        //把奖池奖励打乱顺序
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引,拿i交换
            int number = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }

        //遍历arr
        for (int i : arr) {
            System.out.println(i+"元的奖金被抽出");
        }
    }
}
