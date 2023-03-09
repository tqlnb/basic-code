package com.tql.mytest;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6578);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        int b;
        while ((b = is.read()) != -1){
            System.out.println((char) b);
        }

        socket.close();
        ss.close();
    }
}
