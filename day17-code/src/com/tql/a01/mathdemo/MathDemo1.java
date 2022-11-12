package com.tql.a01.mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
        /*
        public static int        abs(int a)
        获取参数绝对值
        public static double     ceil(double a)
        向上取整
        public static double     floor( double a)
        向下取整
        public static int        round(float a)
        四舍五入
        public static int        max(int a,int b)
        获取两个int值中的较大值
        public static double     pow ( double a ,double b)
        返回a的b次幂的值
        public static double     random()
        返回值为double的随机值，范围[e.e,1.e)
        */

        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(99));
        // bug:
        //以int类型为例，取值范围:-2147483648~2147483647
        //如果没有正数与负数对应，那么传递负数结果有误
        //-2147483648没有正数与之对应，所以abs结果产生bug
        System.out.println(Math.abs(-2147483648));  //-2147483648

/*
        //解决方法  Math.absExact() 超限会报错
        System.out.println(Math.absExact(-2147483648));
*/

        System.out.println(Math.pow(2, 6));
    }
}
