package com.tql;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestEnum {
    public static void main(String[] args) {
        SeasonEnum season = SeasonEnum.AUTUMN;
        System.out.println(season.getSeq());
        if (season == SeasonEnum.AUTUMN) {
            System.out.println("秋天");
        }
        File file = new File("C:\\Users\\tql\\IdeaProjects\\basic-code\\xml730Study\\src\\com\\tql\\" +
                "ProcessArgumentsExample.java");
    }

    public static void test(int i, int j) { // 【强制】方法参数在定义和传入时，多个参数逗号后面必须加空格。
        System.out.println("test");     // 除注释之外的方法签名、左右大括号、方法内代码、空行、回车及任何不可见字符的总行数不超过 80 行。
        // Object 的 equals 方法容易抛空指针异常，应使用常量或确定有值的对象来调用 equals。
        // 推荐使用 JDK7 引入的工具类 java.util.Objects#equals(Object a, Object b)
        // 任何货币金额，均以最小货币单位且为整型类型进行存储。
        // 浮点数之间的等值判断，基本数据类型不能使用 == 进行比较，包装数据类型不能使用 equals进行判断。
        // 说明：浮点数采用“尾数+阶码”的编码方式，类似于科学计数法的“有效数字+指数”的表示方式。二进制无法精确表示大部分的十进制小数，具体原理参考《码出高效》。
        /*
         正例：
            (1)指定一个误差范围，两个浮点数的差值在此范围之内，则认为是相等的。
                float a = 1.0F - 0.9F;
                float b = 0.9F - 0.8F;
                float diff = 1e-6F;
                if (Math.abs(a - b) < diff) {
                    System.out.println("true");
                }
            (2)使用 BigDecimal 来定义值，再进行浮点数的运算操作。
                BigDecimal a = new BigDecimal("1.0");
                BigDecimal b = new BigDecimal("0.9");
                BigDecimal c = new BigDecimal("0.8");
                BigDecimal x = a.subtract(b);
                BigDecimal y = b.subtract(c);
                if (x.compareTo(y) == 0) {
                    System.out.println("true");
                }

        *
        * */

        /*
        * 禁止使用构造方法 BigDecimal(double) 的方式把 double 值转化为 BigDecimal 对象。
           说明：BigDecimal(double) 存在精度损失风险，在精确计算或值比较的场景中可能会导致业务逻辑异常。
           正例：优先推荐入参为 String 的构造方法，或使用 BigDecimal 的 valueOf 方法，此方法内部其实执行了 Double 的
            toString，而 Double 的 toString 按 double 的实际能表达的精度对尾数进行了截断。
        *
        * */


    }
}
