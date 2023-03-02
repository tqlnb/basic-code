package com.tql.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test6 {
    public static void main(String[] args) throws IOException {
        //创建字符流对象
        FileReader fr = new FileReader("day28-code//aaa.txt");
        //定义StringBuilder存数据
        StringBuilder sb = new StringBuilder();
        int b ;
        while ((b = fr.read()) != -1){
            sb.append((char)b);
        }
        fr.close();
        //将StringBuilder转换为字符串
        String s = sb.toString();
        //分割字符串
        String[] split = s.split("-");
        //取出每一个字符并转换为integer并存入集合
        ArrayList<Integer> list = new ArrayList<>();
        for (String s1 : split) {
            list.add(Integer.parseInt(s1));
        }
        //排序
        Collections.sort(list);
        //写出数据
        FileWriter fw = new FileWriter("day28-code//aaa.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                fw.write(list.get(i) + "");
            }else {
                fw.write(list.get(i)+ "-");
            }
        }
        fw.close();
    }
}
