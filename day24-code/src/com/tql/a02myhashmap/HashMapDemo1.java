package com.tql.a02myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student , String> hm = new HashMap<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);
        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");
        hm.put(s4, "山东");


        //遍历集合
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        hm.forEach(( key, value) -> System.out.println(key + "=" + value));

    }
}
