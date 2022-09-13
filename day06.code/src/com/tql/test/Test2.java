package com.tql.test;

public class Test2 {
    public static void main(String[] args) {
        int [] arr1 = {11,23,444,12,33,455};
        System.out.println(max(arr1));
    }

    //求数组最大值并返回
    public static int max(int [] arr){
        int maxium = arr[0];
        for (int i : arr) {
            if(maxium < i)
                maxium = i;
        }
        return maxium;
    }
}
