package com.tql.a02staticdemo2;

public class ArrayUtil {

    //私有化构造方法
    //目的 ： 不让外界创建它的对象
    private ArrayUtil(){}

    //需要定义为静态方法，方便调用
    public static String printArr(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]);
            sb.append(",");
        }
        sb.append(arr[arr.length - 1]).append("]");
        return sb.toString();
    }

    public static double getAverage(double [] arr){
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum/arr.length;
    }


}
