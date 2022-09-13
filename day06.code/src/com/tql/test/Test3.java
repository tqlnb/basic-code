package com.tql.test;

public class Test3 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,3,2,1,13,4,4};
        int a = 3;
        System.out.println(exist(a,arr1));
    }

    //判断数组中某一个数是否存在
    public static String exist (int a,int [] arr){
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
                position = i;
            }
        }
        if(position != -1){
            return "存在，在第"+position+"个位置";
        }
        else{
            return "不存在";
        }
    }
}
