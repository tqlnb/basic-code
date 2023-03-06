package com.tql.test;

import cn.hutool.core.io.FileUtil;

import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class Test5 {
    public static void main(String[] args) throws FileNotFoundException {
        /*需求:
        一个文件里面存储了班级同学的姓名，每一个姓名占一行。
        要求通过程序实现随机点名器。
        第三次必定是张三同学

        运行效果:
        第一次运行程序:随机同学姓名1
        第二次运行程序:随机同学姓名2
        第三次运行程序:张三*/

        //获取学生列表
        List<String> strings = FileUtil.readLines("names.txt", StandardCharsets.UTF_8);
        Collections.shuffle(strings);
        //获取已经运行的次数
        List<String> counts = FileUtil.readLines("count.txt", StandardCharsets.UTF_8);
        int count = Integer.parseInt(counts.get(0));
        count ++;
        //写入现在的次数
        FileUtil.writeString(count+"" , "count.txt" ,StandardCharsets.UTF_8);
        //判断
        if(count == 3){
            System.out.println("单韵云");
        }else {
            System.out.println(strings.get(0).split("-")[0]);
        }
        //输出次数
        System.out.println(count);
    }
}
