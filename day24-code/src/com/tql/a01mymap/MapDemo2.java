package com.tql.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //创建Map集合
        Map<String, String> map = new HashMap();

        //添加元素
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //通过键找值
        //获取所有的键，把这些键放到一个单列集合中
        Set<String> keys = map.keySet();
        //遍历单列集合，得到每一个键
        for (String key : keys) {
            //利用Map中的键获取对应的值 get
            String value = map.get(key);
            System.out.println(key + "=" + value);

        }

        //迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        //Lambda表达式
        keys.forEach((String s) -> {
                String value = map.get(s);
                System.out.println(s + "=" + value);
            }
        );

    }
}
