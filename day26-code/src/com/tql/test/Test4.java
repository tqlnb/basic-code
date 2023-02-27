package com.tql.test;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] newArr = Arrays.stream(arr)
                .filter(number -> number % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(newArr));
    }
}
