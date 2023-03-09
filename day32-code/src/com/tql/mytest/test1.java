package com.tql.mytest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-A5DGA9S");
        System.out.println(address);
        System.out.println(address.getHostName());

    }
}
