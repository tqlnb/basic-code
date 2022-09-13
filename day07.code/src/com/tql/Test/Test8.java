package com.tql.Test;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        //抢红包 2 588 888 1000 10000
        Random r = new Random();
        int [] arr = {2,588,888,1000,10000};
        int [] newarr = {9,9,9,9,9};
        int count = 0;
        while(count < 5) {
            int j = r.nextInt(5);
            //判断是否被抽取
            boolean flag = isFlag(newarr, j);
            if(flag) {
                newarr[count] = j;
                System.out.println(arr[j] + "元的奖金被抽出");
                count++;
            }
        }
    }

    public static boolean isFlag(int[] newarr, int j) {
        boolean flag = true;
        for (int i : newarr) {
            if(j == i ){
                flag =false;
                break;
            }
        }
        return flag;
    }
}
