package com.tql.test55;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.*;

public class Sever5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        //ExecutorService pool = Executors.newCachedThreadPool();

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                6,//线程池总大小
                60,//空闲时间
                TimeUnit.SECONDS,//空闲时间的单位
                new ArrayBlockingQueue<>(2),//队列
                Executors.defaultThreadFactory(),//线程工厂
                new ThreadPoolExecutor.AbortPolicy()//阻塞队列
        );

        while (true) {
            pool.submit(new MyRunnable(ss.accept()));
        }
    }
}
