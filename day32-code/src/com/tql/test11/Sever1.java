package com.tql.test11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);


            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String s;
            while ((s = br.readLine()) != null){
                System.out.println(s);
                bw.write("服务器收到了 :"+ s);
                bw.newLine();
                bw.flush();
            }

            socket.close();
            ss.close();
    }
}
