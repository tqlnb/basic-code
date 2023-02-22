package com.tql.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();

        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
