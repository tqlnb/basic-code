package com.tql.mybufferedstream1;

import java.io.*;

public class CCC {
    public static void main(String[] args) throws IOException {


       BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
       BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\a.txt"));

       int b;
       while((b = bis.read()) != -1){
           bos.write(b);
       }

       bis.close();
       bos.close();



    }
}
