package com.tql.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //字符替换
        String talk = "你玩的真好，下次不要再玩了，TMDTMDNMSL";

        String [] arr = {"TMD","CNM","NMSL","MLGB"};
        for (String s : arr) {
            talk = talk.replace(s,"***");
        }

        System.out.println(talk);
    }
}
