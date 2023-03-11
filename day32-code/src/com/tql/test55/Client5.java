package com.tql.test55;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client5 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("tql") , 5000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day32-code/clientdir/a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;

        while ((len =  bis.read(bytes)) != -1){
            bos.write(bytes , 0, len);
            bos.flush();
        }


        //往服务器写出结束标记
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine().toString());

        socket.close();



    }
}
