package com.tql.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
       int sum = 0 ;
        for (int j : arr1) {
            sum += j;
        }
        System.out.println(sum);
    }
}
