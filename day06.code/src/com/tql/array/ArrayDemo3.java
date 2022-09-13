package com.tql.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int [] arr = {1,2,3,4,5};

        for(int j=0;j<5;j++){
            System.out.println(arr[j]);
        }

        for (int i : arr) {
            System.out.println(i);
        }
        
    }
}
