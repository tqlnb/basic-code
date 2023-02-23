package com.tql.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //批量添加元素
        Collections.addAll(list,"abc","abc","abc","qwer","zxcv");
        System.out.println(list);   //[abc, abc, abc, qwer, zxcv]

        //shuffle
        Collections.shuffle(list);
        System.out.println(list);   //[abc, zxcv, qwer, abc, abc]

        Collections.sort(list);
        System.out.println(list);
    }
}
