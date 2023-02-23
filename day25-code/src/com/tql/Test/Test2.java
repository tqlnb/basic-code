package com.tql.Test;

import java.util.*;
import java.util.function.BiConsumer;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String , ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"南京","扬州","苏州","无锡","常州");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"武汉","孝感","十堰","宜昌","鄂州");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"石家庄","唐山","邢台","保定","张家口");

        hm.put("江苏省",list1);
        hm.put("湖北省",list2);
        hm.put("河北省",list3);

        hm.forEach(new BiConsumer<String, ArrayList<String>>() {
            @Override
            public void accept(String s, ArrayList<String> cities) {
                System.out.print(s+"=");
                for (String city : cities) {
                    System.out.print(city+",");
                }
                System.out.println();
            }
        });
        System.out.println("=====================");

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            System.out.print(entry.getKey()+"=");
            for (String city : entry.getValue()) {
                System.out.print(city+",");
            }
            System.out.println();
        }
    }
 }
