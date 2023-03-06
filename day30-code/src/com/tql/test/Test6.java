package com.tql.test;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        /*需求:
        一个文件里面存储了班级同学的姓名，每一个姓名占一行。要求通过程序实现随机点名器。
        运行效果:
        被点到的学生不会再被点到
        如果班级中所有的学生都点完了，需要自动的重新开启第二轮点名
        细节1:假设班级有10个学生，每一轮中每一位学生只能被点到一次，程序运行10次，第一轮结束
        细节2:第11次运行的时候，我们自己不需要手动操作本地文件，要求程序自动开始第二轮点名
        */

        //获取学生列表
        List<String> strings = FileUtil.readLines("names.txt", StandardCharsets.UTF_8);
        //判断学生列表是否为空,如果为空则从namesDefault.txt拷贝一下
        if(strings.size() == 0){
            List<String> strs = FileUtil.readLines("namesDefault.txt", StandardCharsets.UTF_8);
            FileUtil.writeLines(strs , "names.txt" , StandardCharsets.UTF_8);
            strings = FileUtil.readLines("names.txt", StandardCharsets.UTF_8);
        }
        //打乱学生列表
        Collections.shuffle(strings);
        //打印学生名字并在文件里删除该学生
        System.out.println(strings.get(0).split("-")[0]);
        strings.remove(0);
        FileUtil.writeLines(strings , "names.txt" , StandardCharsets.UTF_8);
    }
}
