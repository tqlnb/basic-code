package com.tql.co;

import cn.hutool.core.convert.Convert;

import java.util.Arrays;

public class ConvertTest {
    public static void main(String[] args) {
        int a = 123;
        byte[] bytes = Convert.intToBytes(a);
        System.out.println(Convert.intToByte(a));
        System.out.println(Arrays.toString(Convert.shortToBytes((short) 123)));
        System.out.println(Arrays.toString(Convert.longToBytes((long)123)));
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(Convert.hexToBytes("00 01 02 03 04 05 06 07 08 09 0A 0B 0C")));


    }
}
