package com.tql.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //数组存储在堆空间里，两个数组指向同一个地址
        int [] arr1 = {11,22,33};
        int [] arr2 = arr1;

        arr2[0] = 33;
        System.out.println(arr2[0]);
        System.out.println(arr1[0]);
    }
}
