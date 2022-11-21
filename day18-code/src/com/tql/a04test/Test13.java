package com.tql.a04test;

import java.util.ArrayList;

public class Test13 {
    public static void main(String[] args) {
        //10转2进制
        int i = 6, j = i;
        ArrayList<Integer> list = new ArrayList<>();

        while(j  != 0){
            list.add(j % 2);
            j /= 2;
        }
        String str = getStr(list);
        System.out.println(str);

    }
    public static String getStr(ArrayList<Integer> list){
        String str = "";
        for (int i = list.size()- 1; i >= 0; i--) {
            str = str + list.get(i);
        }
        return str;
    }
}
