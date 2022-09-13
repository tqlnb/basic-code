package com.tql.test;

public class Test1 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        Printarr(arr1);
    }

    //数组遍历
    public static void Printarr(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1)
                System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]);

        }
        System.out.println("]");
    }
}
