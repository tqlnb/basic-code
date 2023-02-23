package com.tql.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> m = new HashMap();
        //添加元素
        //put方法的细节
        //添加/覆盖

        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回null
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "沐剑屏");
        m.put("尹志平", "小龙女");

        String value2 = m.put("韦小宝","双儿");
        System.out.println(value2);     //沐剑屏

        //删除
        String result = m.remove("郭靖");
        System.out.println(result);     //黄蓉

        //判断是否包含
        System.out.println(m.containsKey("韦小宝"));
        System.out.println(m.containsValue("双儿"));

        //集合长度
        int size = m.size();

        //清空
        m.clear();

        System.out.println(size);
        System.out.println(m);
    }
}
