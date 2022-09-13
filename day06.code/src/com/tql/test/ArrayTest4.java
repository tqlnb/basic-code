package com.tql.test;

public class ArrayTest4 {
    public static void main(String[] args) {
        //交换数组顺序
        int [] arr = {1,2,3,4,5};
        for(int i = 0, j = arr.length -1 ; i < j ; i++ , j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
