package com.tql.lambda;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
            定义数组并存储一些字符串，利用Arrays中的sort方法进行排序要求:
                按照字符串的长度进行排序，短的在前面，长的在后面。(暂时不比较字符串里面的内容>
        */
        String [] arr = {"a","aaaa","aa","aaa"};

        //如果以后我们要把数组中的数据按照指定的方式进行排列，就需要用到sort方法，而且要指定排序的规则
        Arrays.sort(arr, ( o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
