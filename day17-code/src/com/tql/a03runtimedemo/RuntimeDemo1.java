package com.tql.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            public static   Runtime getRuntime( )    当前系统的运行环境对象
            public void     exit(int status)         停止虚拟机
            public int      availableProcessors()    获得cPU的线程数
            public long      maxMemory ( )          JVM能从系统中获取总内存大小（单位byte)
            public long      totalMemory()           JVM已经从系统中获取总内存大小（单位byte)
            public long     freeMemory ( )           JVM剩余内存大小(单位byte)
            public Process   exec ( string command)   运行cmd命令
         */

        //获取Runtime对象
        Runtime r1 = Runtime.getRuntime();

        //停止虚拟机停止虚拟机
        //r1.exit(0);

        //获得cPU的线程数
        System.out.println(r1.availableProcessors());

        //JVM能从系统中获取总内存大小
        System.out.println(r1.maxMemory()/1024/1024);

        //JVM已经从系统中获取总内存大小
        System.out.println(r1.totalMemory()/1024/1024);

        //JVM剩余内存大小
        System.out.println(r1.freeMemory()/1024/1024);

        //运行cmd命令
        //r1.exec("notepad");
        // shutdown :关机
        // 加上参数才能执行
        // -s :默认在1分钟之后关机
        // -s -t指定时间:指定关机时间l
        // -a :取消关机操作
        // -r:关机并重启
        r1.exec("shutdown /s /t 1800");
    }
}
