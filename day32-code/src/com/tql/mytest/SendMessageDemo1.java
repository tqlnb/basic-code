package com.tql.mytest;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo1 {
    public static void main(String[] args) throws IOException {

        DatagramSocket dgs = new DatagramSocket();

        String str = "???";
        byte[] bytes = str.getBytes();
        DatagramPacket pgp = new DatagramPacket(bytes , bytes.length , InetAddress.getByName("127.0.0.1") , 8888);

        dgs.send(pgp);

        dgs.close();
    }
}
