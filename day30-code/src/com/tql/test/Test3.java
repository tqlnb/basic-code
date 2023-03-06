package com.tql.test;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> strings = FileUtil.readLines("names.txt", StandardCharsets.UTF_8);
        Collections.shuffle(strings);
        System.out.println(strings.get(0).split("-")[0]);
    }
}
