package com.tql.co;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] ints = new int[1024*100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        //quickSort(ints,0,ints.length-1);
        System.out.println(Arrays.toString(ints));
        long end = System.currentTimeMillis();
        System.out.println("耗时: "+(end-start)+"ms");
    }

    public static void quickSort(int[] arr, int left, int right) {
        int begin = left;
        int end = right;

        // 递归出口
        if (begin >= end){
            return;
        }

        while (!(begin==end)){
            // 从右边开始,找到比基准数小的数
            while(arr[end]>=arr[begin] && end > begin){
                end--;
            }
            // 从左边开始,找到比基准数大的数
            while(arr[begin]<=arr[end] && begin < end){
                begin++;
            }
            // 交换两个数在数组中的位置
            int temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
        }
        // 当两个指针相遇时,将基准数与指针相遇位置的数交换
        int temp = arr[begin];
        arr[begin] = arr[left];
        arr[left] = temp;

        // 递归调用
        quickSort(arr,left,begin-1);
        quickSort(arr,begin+1,right);
    }

}
