package com.tql.mytest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo2 {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(23333);


        while (true){

            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes , bytes.length);

            ds.receive(dp);

            byte[] data = dp.getData();
            String str = new String(data, 0 , data.length);
            System.out.println(str);

            if (str.equals("886")){
                break;
            }
        }

        ds.close();
    }
}
