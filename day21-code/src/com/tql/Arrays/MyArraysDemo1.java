package com.tql.Arrays;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};

        //copyOf
        int[] newArr = Arrays.copyOf(arr1, 12);
        System.out.println(Arrays.toString(newArr));

        //copyOfRange
        //包头不包尾
        System.out.println("------------copyOfRange-----------");
        int[] newArr2 = Arrays.copyOfRange(arr1, 0, 10);
        System.out.println(Arrays.toString(newArr2));

        Integer [] arr2 = {2,3,1,5,4,9,7,8,6};
        Arrays.sort(arr2, (Integer o1, Integer o2) -> {

                return o2-o1;

        });

        System.out.println(Arrays.toString(arr2));

    }
}
