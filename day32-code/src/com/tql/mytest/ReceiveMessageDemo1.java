package com.tql.mytest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo1 {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(8888);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);

        ds.close();

        byte[] data = dp.getData();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        int length = dp.getLength();



        System.out.println(address.getAddress() + ":" + port );
    }
}
