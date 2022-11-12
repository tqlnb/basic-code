package com.tql.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //自幂数 一个n位自然数等于自身各个数位上数字的n次幂之和
/*        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int input = sc.nextInt();
        System.out.println(isMi(input));*/
        //存取自幂数
        ArrayList<Integer> list = new ArrayList<>();
        //统计三位的自幂数
        for (int i = 100; i < 1000; i++) {
            if (isMi(i)) {
                list.add(i);
            }
        }
        System.out.println(list.size());
        System.out.println(list);
    }

    //判断是否为自幂数
    public static boolean isMi(int input){
        int input1 = input;
        int wei = getWei(input1);
        int count = 0;
        while (input1 != 0) {
            count += Math.pow(input1 % 10,wei);
            input1 /= 10;
        }
        return count == input;
    }

    //判断位数
    public static int getWei(int input){
        int count = 0;
        while (input != 0){
            input /= 10;
            count ++;
        }
        return count;
    }
}
