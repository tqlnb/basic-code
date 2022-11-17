package com.tql.a07bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
        public BigDecimal add(BigDecimal val)                        加法
        public BigDecimal subtract(BigDecimal val)                   减法
        public BigDecimal multiply(BigDecimal val)                   乘法
        public BigDecimal divide( BigDecimal val)                    除法
        public BigDecimal divide(BigDecimal val，精确几位，舍入模式)   除法
        */
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        System.out.println(bd1.add(bd2));

        //RoundingMode.HALF_UP:四舍五入模式
        BigDecimal bd3 = bd1.divide(bd2,2, RoundingMode.HALF_UP);
        System.out.println(bd3);
    }
}
