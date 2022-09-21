package com.tql.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //给定两个字符串,A和B。
        //A的旋转操作就是将A最左边的字符移动到最右边。
        // 例如，若A= 'abcde'，在移动一次之后结果就是'bcdea'。
        // 如果在若干次调整操作之后，A能变成B，那么返回True。
        // 如果不能匹配成功，则返回false
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串A");
        String str1 = sc.next();
        System.out.println("请输入字符串B");
        String str2 = sc.next();
        boolean match = match(str1, str2);
        System.out.println(match);
    }
    public static boolean match(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            if(str1.equals(str2)){
                return true;
            }
            str1 = rev(str1);
        }
        return false;
    }
    public static String rev(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(str.length()-1));
        //可以优化：使用substring
        //String end = str.substring(1);
        for (int i = 0; i < str.length()-1; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    //套路:
    //如果我们看到要修改字符串的内容可以有两个办法:
    //1.用substring进行截取，把左边的字符截取出来拼接到右恻去
    //2.可以把字符串先变成一个字符数组，然后调整字符数组里面数据，
    // 最后再把字符数组变成字符串。
}
