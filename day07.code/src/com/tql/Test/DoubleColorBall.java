package com.tql.Test;

import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {
    public static void main(String[] args) {
        //模拟双色球
        //红球
        int[] arr = new int[7];
        Random r = new Random();
        int count = 0;
        //模拟红球结果
        while (count < 6) {
            int temp = r.nextInt(33) + 1;
            boolean flag = isFlag(arr, temp);
            if (flag) {
                arr[count] = temp;
                count++;
            }
        }

        //模拟蓝球
        int blue = r.nextInt(16)+1;
        arr[6] = blue;

        //作弊器
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        //键盘录入选号
        Scanner sc =new Scanner(System.in);
        int [] arrchoose = new int[7];
/*
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("请录入第"+(i+1)+"个红球，共6个，范围是1-33");
            arrchoose[i] =sc.nextInt();
            if(arrchoose[i] < 1 || arrchoose[i] >33){
                System.out.println("输入错误");
                return;
            }
        }
*/
        //录入红球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请录入第"+(i+1)+"个红球，共6个，范围是1-33，不能重复");
            int redNumber = sc.nextInt();
            if(redNumber > 0 && redNumber <= 33) {
                boolean flagRed = isFlagRed(arrchoose, redNumber);
                if (flagRed) {
                    arrchoose[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已存在，请重新输入");
                }
            }else{
                System.out.println("红球号码超出范围，请重新输入");
            }

        }
        //录入蓝球号码
        while(true) {
            System.out.println("请录入蓝球号,范围是1-16");
            int blueChoose = sc.nextInt();
            if (blueChoose < 1 || blueChoose > 33) {
                System.out.println("输入错误,请重新输入");
            } else {
                arrchoose[6] = blueChoose;
                break;
            }
        }
        //判断中几个球
        int redCount = 0,blueCount = 0;
/*
        for (int j : arrchoose) {
            for (int i : arrchoose) {
                if (j == i) {
                    redCount++;
                    break;
                }
            }
        }
*/
        for (int i = 0; i < arrchoose.length-1; i++) {
            for (int i1 = 0; i1 < arr.length-1; i1++) {
                if(arrchoose[i] == arr[i1]){
                    redCount ++;
                    break;
                }
            }
        }
        if (arrchoose[6] == blue)
            blueCount = 1;
        //判断几等奖
        extracted(redCount, blueCount);
    }

    public static boolean isFlagRed(int[] arr, int redNumber) {
        boolean flagRed = true ;
        for (int j : arr) {
            if (redNumber == j) {
                flagRed = false;
                break;
            }
        }
        return flagRed;
    }

    public static void extracted(int redCount, int blueCount) {
        switch (redCount + blueCount) {
            case 0 -> System.out.println("没中奖，谢谢惠顾！");
            case 1 -> {
                if(redCount == 1)
                    System.out.println("没中奖，谢谢惠顾！");
                else
                    System.out.println("中了" + redCount + "个红球," + blueCount + "个蓝球，六等奖，5元");
            }
            case 2,3 -> System.out.println("中了" + redCount + "个红球," + blueCount + "个蓝球，六等奖，5元");
            case 4 -> System.out.println("中了" + redCount + "个红球," + blueCount + "个蓝球，五等奖，10元");
            case 5 -> System.out.println("中了" + redCount + "个红球," + blueCount + "个蓝球，四等奖，200元");
            case 6 -> {
                if (redCount == 5) {
                    System.out.println("中了" + redCount + "个红球," + blueCount + "个蓝球，三等奖，3000元");
                } else {
                    System.out.println("中了" + redCount + "个红球," + blueCount + "个蓝球，二等奖，500万元");
                }
            }
            case 7 -> System.out.println("全中，1等奖，奖金1000万元");
            default -> System.out.println("error!");
        }
    }


    public static boolean isFlag(int[] in, int temp) {
        boolean flag = true;
        for (int i : in) {
            if (i == temp) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
