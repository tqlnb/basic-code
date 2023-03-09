package com.tql.mytest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            byte[] bytes = str.getBytes();

            DatagramPacket dp = new DatagramPacket(bytes , bytes.length , InetAddress.getByName("tql") , 23333); //192.168.1.24

            ds.send(dp);

            if(str.equals("886")){
                break;
            }
        }
        ds.close();
    }
}
