package com.tql.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        //创建集合并添加元素
        ArrayList<String> maleActorList = new ArrayList<>();
        ArrayList<String> femaleActorList = new ArrayList<>();
        Collections.addAll(maleActorList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(femaleActorList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");
        //分别对两个集合进行流处理,得到两个流
        Stream<String> maleStream = maleActorList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        Stream<String> femaleStream = femaleActorList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        //使用concat进行流合并再用map把流转换成actor,最后打包成list
        List<Actor> actorList =
                Stream.concat(maleStream, femaleStream)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                        .collect(Collectors.toList());

        System.out.println(actorList);
    }
}
