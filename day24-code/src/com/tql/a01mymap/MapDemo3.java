package com.tql.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //创建Map集合的对象
        Map<String, String> map = new HashMap();
        //添加元素
        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "尹志平");

        //通过键值对方式遍历
        //通过一个方法获取所有的键值对对象，方法返回一个set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //遍历entries集合，获取其中所有键值对
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        //迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        //内部类（可简化Lambda表达式）
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry.getKey()+"="+stringStringEntry.getValue());
            }
        });


    }
}
