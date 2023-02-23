package com.tql.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, String> map = new HashMap();
        //添加元素
        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "不可能绝对不可能");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼色行事");

        //利用Lambda表达式遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        map.forEach(( key, value) -> System.out.println(key + "=" + value));


    }
}
