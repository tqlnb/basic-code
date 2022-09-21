package com.tql.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        //生成验证码
        //内容:可以是小写字母，也可以是大写字母，还可以是数字规则;
        //长度为5
        //内容中是四位字母，1位数字。
        //其中数字只有1位，但是可以出现在任意的位置。

        char [] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char)(i+65);
        }
        for (int i = 26; i < 52; i++) {
            arr[i] = (char)(i+97-26);
        }
        Random r = new Random();
        String str = "";
        for(int i = 0 ; i < 4 ; i++){
            str = str + arr[r.nextInt(52)];
        }
        str = str + (r.nextInt(10)+48);
        char [] arr1 = new char[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = str.charAt(i);
        }
        for (int i = 0; i < arr1.length; i++) {
            char temp = arr1[i];
            int j =r.nextInt(5);
            arr1 [i]=arr1[j];
            arr1[j] = temp;
        }
        String str1 = new String(arr1);
        System.out.println(str1);
    }

    // 3.生成一个e~9之间的随机数拼接到最后
    // ACFG7
    //思考，我们把7放到前面，修改了字符串的内容
    // 把生成的验证码先变成一个字符数组
    //再让最后一个元素跟前面的随机位置的元素进行交换
    // 交换完毕之后再变成字符串就可以了。
}
