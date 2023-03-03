package com.tql.test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        制造假数据:
        获取姓氏: https://hanyu.baidu.com/shici/detail?pid=0b2f26d4ceddb3ee693fdb1137ee1b0d&from=kg0
        获取男生名字: http://www.haoming8.cn/baobao/10881.html
        获取女生名字: http://www.haoming8.cn/baobao/7641.html
        */

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kgo";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //通过正则表达式把其中数据获取出来
        ArrayList<String> familyNameTempList = getData(familyNameStr , "(.{4})(，|。)",1);
        ArrayList<String> boyNameTempList = getData(boyNameStr , "([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTempList = getData(girlNameStr , "(.. ){4}..",0);

        System.out.println(familyNameTempList);


        //处理数据
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
        //处理方案:把里面的每一个元素用空E进行切割，得到每一个女生的名字
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            Collections.addAll(girlNameList, str.split(" "));
        }

        //生成数据



    }

    /*
    * 作用:根据正则表达式获取里面符合规则的数据
    * 参数一:
    *       完整的字符串
    *  参数二:
    *       正则表达式
    * 参数三:
    *       获取的是第几组数据
    *
    * 返回值:
    *       想要的数据
    *
    * */
    private static ArrayList<String> getData(String str, String regex , int index) {
        //创建集合存取数据
        ArrayList<String> list = new ArrayList<>();
        //根据正则表达式获取数据
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(index);
            list.add(group);
        }
        return list;

    }

    /*
    *   爬取网络中的数据,返回字符串
    *   形参:网址
    *   返回值:爬取到的数据
    *
    *
    * */
    public static String webCrawler(String net) throws IOException {
        //定义SringBulider拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //创建一个URL对象
        URL url = new URL(net);
        //连接上这个网址
        URLConnection conn = url.openConnection();
        //读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1){
            sb.append((char)ch);
        }
        //释放资源
        isr.close();
        return sb.toString();
    }
}
