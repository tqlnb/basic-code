package com.tql;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(16);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
/*        List<String> strings = list.subList(0, 2);
        strings.remove(0);*/
        /*
        * 在 subList 场景中，高度注意对父集合元素的增加或删除，均会导致子列表的遍历、增加、删
            除产生 ConcurrentModificationException 异常。
        * */

        /*
        * 【强制】不要在 foreach 循环里进行元素的 remove / add 操作。remove 元素请使用 iterator 方式，
         如果并发操作，需要对 iterator 对象加锁。
        * */
        for (String s : list) {
            System.out.println(s);
        }
    }
}
