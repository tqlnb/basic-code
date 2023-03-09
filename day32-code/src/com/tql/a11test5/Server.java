package com.tql.a11test5;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            //2.等待客户端来连接
            Socket socket = ss.accept();

            //创建一条线程
            //一个用户就对应服务端的一条线程
            Thread thread = new Thread(new MyRunnable(socket));
            //将线程加入线程池
            ExecutorService pool = Executors.newCachedThreadPool();
            pool.submit(thread);
        }

    }
}