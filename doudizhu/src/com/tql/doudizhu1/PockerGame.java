package com.tql.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;


public class PockerGame {

    static ArrayList<String> list = new ArrayList<>();

    //静态代码块
    //随着类的加载而加载,且只执行一次
    static {
        //准备牌
        String[] color = {"♥","♦","♣","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //牌盒
        for (String c : color) {
            //c依次表示每一种花色
            for (String n : number) {
                //n依次表示每一个数字
                list.add(c+n);
            }
        }
        list.add("RedJoker");
        list.add("BlackJoker");
    }
    public PockerGame(){

        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            //i:索引
            String poker = list.get(i);
            if(i <= 2){
                lord.add(poker);
                continue;   //跳过以下语句,进入下一次循环
            }
            switch (i % 3){
                case 0 -> player1.add(poker);
                case 1 -> player2.add(poker);
                case 2 -> player3.add(poker);
                default -> {
                    System.out.println("发牌出问题了");
                    return;
                }
            }

        }

        //看牌
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
        lookPoker("底牌",lord);
    }

    /*
    * 看牌
    * 参数1 : 玩家的名字
    * 参数2 : 玩家的牌
    * */
    public void lookPoker(String name , ArrayList<String> pokerList){
        System.out.print(name+"的牌: ");
        for (String poker : pokerList) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }

}
