package com.tql.stringbulider;

public class StringbuliderDemo5 {
    public static void main(String[] args) {
        //拼接字符串
        int [] arr = {1,2,4,3,2,4,5,7};
        StringBuilder sb =new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]).append(",");
        }
        sb.append(arr[arr.length-1]).append("]");
        String s = sb.toString();
        System.out.println(s);
    }
}
