package com.tql.test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        /*
        利用糊涂包制造假数据:
        获取姓氏: https://hanyu.baidu.com/shici/detail?pid=0b2f26d4ceddb3ee693fdb1137ee1b0d&from=kg0
        获取男生名字: http://www.haoming8.cn/baobao/10881.html
        获取女生名字: http://www.haoming8.cn/baobao/7641.html
        */

        //1.定义网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kgo";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.利用正则表达式获取数据
        List<String> familyNameTempList = ReUtil.findAll( "(.{4})(，|。)", familyNameStr , 1);
        List<String> boyNameTempList = ReUtil.findAll( "([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr , 1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        //4.处理数据
        //familyNameTempList（姓氏)
        //处理方案:把每一个姓氏拆开并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            //str 赵钱孙李 周吴郑王 冯陈褚卫
            for (int i = 0; i < str.length(); i++) {
                familyNameList.add(str.charAt(i) +"");
            }
        }
        //boyNameTempList（男生的名字)
        //处理方案:去除其中的重复元素
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if(!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }
        //girlNameTempList （女生的名宁)
        //处理方案:把里面的每一个元素用空格进行切割，得到每一个女生的名字
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            Collections.addAll(girlNameList, str.split(" "));
        }

        //5.生成数据
        //生成数据
        //糊涂包的相对路径不是相对于当前项目而言的,而是相对于class文件而言的
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 4, 6);
        Collections.shuffle(list);

        FileUtil.writeLines(list , "names.txt", StandardCharsets.UTF_8);

    }

    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,ArrayList<String> boyNameList, ArrayList<String> girlNameList,int boyCount , int girlCount){
        //生成不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (boyhs.size() != boyCount) {
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }

        HashSet<String> girlhs = new HashSet<>();
        while (girlhs.size() != girlCount) {
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }

        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();

        for (String boyName : boyhs) {
            //boyName表示每一个男生的名字
            //18-27
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }

        for (String girlName : girlhs) {
            //boyName表示每一个男生的名字
            //18-27
            int age = r.nextInt(10) + 18;
            list.add(girlName + "-女-" + age);
        }

        return list;
    }

}
