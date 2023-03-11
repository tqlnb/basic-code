package com.tql.test55;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{

    Socket socket;

    public MyRunnable(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //接收数据
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            //获取uuid
            String name = UUID.randomUUID().toString().replace("-", "");
            //往文件写入数据
            BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("day32-code\\serverdir\\"+name+".png"));

            byte[] bytes = new byte[1024];
            int len;
            while (( len = bis.read(bytes) ) != -1){
                bos.write( bytes , 0 , len);
                bos.flush();
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("写入成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
