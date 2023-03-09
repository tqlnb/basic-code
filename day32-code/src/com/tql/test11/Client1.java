package com.tql.test11;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1" , 10000);

//        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            bw.write(s);
            bw.newLine();
            bw.flush();
            System.out.println(br.readLine());
            if(s.equals("886")){
                break;
            }
        }

        socket.close();
    }
}
