package com.tql.a04mytreemap;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>((o1, o2) -> o2-o1);
        tm.put(5, "可恰可乐");
        tm.put(4, "雷碧");
        tm.put(3, "九个核桃");
        tm.put(2, "康帅傅");
        tm.put(1, "粤利粤");
        System.out.println(tm); //{5=可恰可乐, 4=雷碧, 3=九个核桃, 2=康帅傅, 1=粤利粤}
    }
}
