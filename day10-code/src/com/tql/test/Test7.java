package com.tql.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
        返回字符串中最后一个单词的长度。
        单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
        示例1:输入: s = "Hello wor1d"       输出:5
        解释:最后一个单词是“World"，长度为5。
        示例2:输入:s = "fly meto the moon "      输出:4
        解释:最后一个单词是"moon”，长度为4
        示例3:输入: s = "luffy is still joyboy"     输出:6
        解释:最后一个单词是长度为6的“joyboy”。*/


        //解法：倒着遍历
        //录入。且要录入空格 用nextLine
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        System.out.println("请输入一个字符串");
        sb.append(sc.nextLine());
        //反转
        sb.reverse();
        String str = sb.toString();
        int count = 0;
        //获取数组长度
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                count ++;
            }else{
                break;
            }
        }
        //存入数组
        char [] arr = new char[count];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                arr[i]= str.charAt(i);
            }else{
                break;
            }
        }
        //反转
        String str1 = new String(arr);
        StringBuilder sb2 = new StringBuilder();
        String result = sb2.append(str1).reverse().toString();
        System.out.println(result);
    }
}
