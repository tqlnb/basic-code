package com.tql.test;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4, 5, 6};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("看看我执行了吗");

        //正常的输出语句
        System.out.println(123);

/*        //错误的输出语句(输出是红色的)
        System.err.println(123);*/
    }
}
