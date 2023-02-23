package com.tql.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class PokerGame2 {
    static ArrayList<String> list = new ArrayList<>();
    static TreeMap<Integer , String> tm = new TreeMap<>();
    static ArrayList<Integer> code = new ArrayList<>();

    //静态代码块
    //随着类的加载而加载,且只执行一次
    static {
        //准备牌
        String[] color = {"♥","♦","♣","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //牌盒
        for (String n : number) {
            //c依次表示每一种数字
            for (String c : color) {
                //n依次表示每一个花色
                list.add(c+n);
            }
        }
        //添加大小王
        list.add("RedJoker");
        list.add("BlackJoker");
        //把序号和牌存入Map数组
        for (int i = 0; i < list.size(); i++) {
            tm.put(i,list.get(i));
        }
        //序号的数组
        for (int i = 0; i < list.size(); i++) {
            code.add(i);
        }
    }

    public PokerGame2(){

        ArrayList<Integer> lord = new ArrayList<>();
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        //洗牌
        Collections.shuffle(code);

        //发牌
        for (int i = 0; i < code.size(); i++) {
            if(i <= 2){
                lord.add(code.get(i));
                continue;
            }
            switch (i % 3){
                case 0 -> player1.add(code.get(i));
                case 1 -> player2.add(code.get(i));
                case 2 -> player3.add(code.get(i));
                default -> {
                    System.out.println("发牌出问题了");
                    return;
                }
            }
        }

        //看牌
        lookPoker("tql",player1);
        lookPoker("twt",player2);
        lookPoker("wzk",player3);
        lookPoker("lord",lord);

    }
    public void lookPoker(String name , ArrayList<Integer> pokerList){
        //用TreeMap存序号来自动排序
        TreeMap<Integer , String> tm1 = new TreeMap<>();
        for (Integer pokerCode : pokerList) {
            tm1.put(pokerCode,tm.get(pokerCode));
        }
        System.out.print(name + " : ");
        tm1.forEach( (value,key) -> System.out.print(key+" "));
        System.out.println();
    }
}
