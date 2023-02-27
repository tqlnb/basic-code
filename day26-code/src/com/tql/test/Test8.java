package com.tql.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        list.stream().map(Integer :: parseInt).forEach(System.out::println);

    }
}
