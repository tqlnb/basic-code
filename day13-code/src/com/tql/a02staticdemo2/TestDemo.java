package com.tql.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类的两个方法

        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double [] arr2 = {1.2,3,1.2,4,3.3,5,3.1,4.2};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);

    }
}
