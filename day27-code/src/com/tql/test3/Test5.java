package com.tql.test3;

import java.io.File;
import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {
               /*
            需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
            打印格式如下：
            txt:3个
            doc:4个
            jpg:6个


        */
        File file = new File("G:\\英雄联盟");
        //创建HashMap存文件夹类型和数量
        HashMap<String , Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm1 = getCount(file, hm);
        System.out.println(hm1.toString());
    }

    /*
     * 作用：
     *       统计一个文件夹中每种文件的个数
     * 参数：
     *       要统计的那个文件夹
     * 返回值：
     *       用来统计map集合
     *       键：后缀名 值：次数
     *
     *       a.txt
     *       a.a.txt
     *       aaa（不需要统计的）
     *
     *
     * */
    public static HashMap<String , Integer> getCount(File file ,HashMap<String , Integer> hm){
        //进入file文件夹
        File[] files = file.listFiles();
        //如果文件夹不为空则遍历文件夹
        if(files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    //判断,如果是文件,取出后缀,注意:"."要用转义的点
                    String[] split = file1.getName().split("\\.");
                    //如果文件是没有后缀的文件,不统计
                    if(split.length >= 2) {
                        String end = split[split.length - 1];
                        if (hm.containsKey(end)) {
                            //键存在
                            Integer count = hm.get(end);
                            count++;
                            hm.put(end, count);
                        } else {
                            //键不存在
                            hm.put(end, 1);
                        }
                    }
                } else {
                    //进入下一轮递归
                    getCount(file1, hm);
                }
            }
        }
        //返回最终的集合
        return hm;
    }
}
