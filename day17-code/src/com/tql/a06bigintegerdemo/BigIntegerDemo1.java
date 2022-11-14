package com.tql.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
            public BigInteger(int num，Random rnd)
            获取随机大整数，范围:[e ~ 2的num次方-1]
            public BigInteger( string val)
            获取指定的大整数
            public BigInteger( string val, int radix)
            获取指定进制的大整数
            public static BigInteger valueOf(long val)
            静态方法获取BigInteger的对象，内部有优化
            细节:
            对象一旦创建里面的数据不能发生改变。
        */

        BigInteger bd1 = new BigInteger(10,new Random());
        System.out.println(bd1);

        //获取指定的大整数
        //小细节：字符串中必须是整数，否则报错
        BigInteger bd2 = new BigInteger("12345678901234567890");
        System.out.println(bd2);

        //获取指定进制的大整数
        //细节:
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写0和1，写其他的就报错。
        BigInteger bd4 = new BigInteger("j",20);    //19
        System.out.println(bd4);


        //静态方法获取BigInteger的对象，内部有优化
        //细节:
        //1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
        //2.在内部对常用的数字:-16 ~ 16进行了优化。
        //提前把-16 ~ 16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);

        System.out.println(bd5 == bd6);     //true

        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);

        System.out.println(bd7 == bd8);     //false


        //对象一旦创建不能改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger newBd = bd9.add(bd10);
        System.out.println(newBd);      //3
        //此时，不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录3


    }
}
