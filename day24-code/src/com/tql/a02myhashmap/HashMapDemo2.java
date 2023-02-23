package com.tql.a02myhashmap;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //先让同学们投票
        //定义一个数组储存景点
        String[] arr = {"A","B","C","D"};
        //利用随机数模拟80个同学的投票，，并把投票存起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);

        }

        //如果要统计的东西比较多，不方便使用计数器思想
        //可以定义Map集合，利用集合进行统计
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            //判断当前景点在集合中是否存在
            if(hm.containsKey(name)){
                //存在
                //先获取当前景点被投票的次数
                Integer count = hm.get(name);
                count ++;
                //把新的次数添加到集合
                hm.put(name,count);
            }else {
                //不存在
                hm.put(name,1);
            }
        }
        System.out.println(hm);
        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() > max) max = entry.getValue();
        }

        //判断那个景点最多，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == max) System.out.println(entry.getKey());
        }
    }
}
