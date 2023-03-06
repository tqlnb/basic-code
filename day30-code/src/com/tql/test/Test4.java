package com.tql.test;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        List<String> strings = FileUtil.readLines("names.txt", StandardCharsets.UTF_8);
        String name = readName(strings);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(readName(strings));
        }
        //FileUtil.writeLines(list , "nameCount.txt" , StandardCharsets.UTF_8);
        int count = getCount(list, 1);
        System.out.println(count);

    }

    private static int getCount(ArrayList<String> list, int i) {
        //i=1 男  i=2 女
        int count = 0;
        for (String s : list) {
            if(s.split("-")[1].equals("男")){
                count ++;
            }
        }
        return count;
    }

    public static String readName(List<String> strings){
        Random r =new Random();
        Collections.shuffle(strings);
        if(r.nextInt(10) < 7){
            //点男生
            for (String string : strings) {
                String[] split = string.split("-");
                if(split[1].equals("男")){
                    return string;
                }
            }
        }else {
            //点女生
            for (String string : strings) {
                String[] split = string.split("-");
                if(split[1].equals("女")){
                    return string;
                }
            }
        }
        return null;
    }
}
