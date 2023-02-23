package com.tql.a04mytreemap;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*//定义字符串*/
        String str = "aababcabcdabcde";
        //创建TreeMap对象
        TreeMap <Character , Integer> tm =new TreeMap<>();
        //遍历得到字符串每一个字符
        for (int i = 0; i < str.length(); i++) {
            if(tm.containsKey(str.charAt(i))){
                //如果键已存在,值加一
                Integer count = tm.get(str.charAt(i));
                count ++;
                tm.put(str.charAt(i),count);
            }else {
                //键不存在,添加新的键
                tm.put(str.charAt(i),1);
            }
        }
        //格式化输出(利用Lambda表达式)
        tm.forEach((character, integer) -> System.out.print(character+"("+ integer + ")")

        );
    }
}
