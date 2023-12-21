package com.tql.co;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import cn.hutool.log.StaticLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollUtilTest {
    private static final Log log = LogFactory.get();
    public static void main(String[] args) {
        String[] col= new String[]{"a","b","c","d","e"};
        ArrayList<String> list = CollUtil.newArrayList(col);
        ArrayList<Integer> list1 = CollUtil.newArrayList(1, 2, 4, 5, 6, 7);
        StaticLog.info("list: {}", list);
        HashMap<String, String> hashMap1 = new HashMap<>() {{
            put("a", "1");
            put("b", "2");
            put("c", "3");
        }};
        HashMap<String, String> hashMap2 = new HashMap<>() {{
            put("a", "3");
            put("b", "4");
            put("c", "5");
        }};
        ArrayList<HashMap<String, String>> hashMaps = new ArrayList<>();
        hashMaps.add(hashMap1);
        hashMaps.add(hashMap2);
        StaticLog.info("hashMaps: {}", hashMaps);
        Map<String, List<String>> stringListMap = MapUtil.toListMap(hashMaps);
        System.out.println(stringListMap);
        StaticLog.info("stringListMap: {}", stringListMap);
    }
}
