package com.tql.test;

public class Test4 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,54,6,6,3,2,2,3,4,54,54,2,12,1,1,1,32,44,5,1};
        int [] arr2 = copyOfRange(arr1,10,18);
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    //把一个数组的部分元素copy到另一个数组中
    public static int[] copyOfRange(int[] arr,int from,int to){
        int range = to -from;
        int [] newArr = new int[range];
        for (int i = from; i < to; i++) {
            newArr[i-from] = arr[i];
        }
        return newArr;
    }
}
