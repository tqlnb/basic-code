package com.tql.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> maleActorList = new ArrayList<>();
        ArrayList<String> femaleActorList = new ArrayList<>();
        Collections.addAll(maleActorList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(femaleActorList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        List<String> manCollect = maleActorList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2)
                .collect(Collectors.toList());
        List<String> womanCollect = femaleActorList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1)
                .collect(Collectors.toList());

        for (String s : manCollect) {
            womanCollect.add(s);
        }

        ArrayList<Actor> actorList = new ArrayList<>();

        for (String s : womanCollect) {
            String[] split = s.split(",");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            actorList.add(new Actor(name,age));
        }

        System.out.println(actorList);

    }
}
