package com.tql.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
        public static boolean equals(object a, object b)
        先做非空判断，比较两个对象
        public static boolean isNull(object obj)
        判断对象是否为null，为null返回true ,反之
        public static boolean nonNu11(object obj)
        判断对象是否为null，跟isNull的结果相反
        */

        //创建学生的对象
        Student s1 = null;
        Student s2 = new Student("zhangsan",23);

        //比较两个对象属性值是否相同
        System.out.println(Objects.equals(s1, s2));

        /*      源码
        *       public static boolean equals(Object a, Object b) {
                    return (a == b) || (a != null && a.equals(b));
                }
        *
        * */

        //细节:
        //return (a == b) ,先比较地址值，如果一样直接返回true
        //如果地址不一样进行下面判断(a != null && a.equals(b))
        //1.方法的底层会判断s1是否为null，如果为null，直接返回false
        //2.如果s1不为nu11，那么就利用s1再次调用equals方法
        //3.此时s1是student类型，所以最终还是会调用student中的equals方法。
        //如果没有重写，比较地址值，如果重写了，就比较属性值。


        Student s3 = new Student();
        System.out.println(Objects.isNull(s3));
    }
}
