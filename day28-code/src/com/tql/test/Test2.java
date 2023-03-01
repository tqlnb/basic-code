package com.tql.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("day28-code\\aaa.txt");
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.txt");

        int b;
        while(( b = fis.read()) != -1){
            fos.write(b);
        }
        fis.close();
        fos.close();

    }
}
