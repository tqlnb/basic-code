package com.tql.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);
        int number = list.get(0);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girlList,"杜琦燕","袁明媛","李猜","田蜜蜜");
        if(number == 1 ){
            Collections.shuffle(boyList);
            System.out.println(boyList.get(0));
        }else {
            Collections.shuffle(girlList);
            System.out.println(girlList.get(0));
        }
    }
}
