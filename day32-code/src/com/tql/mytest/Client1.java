package com.tql.mytest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1" , 6578);

        OutputStream os = socket.getOutputStream();

        os.write("AAA".getBytes());

        os.close();
        socket.close();

    }
}
