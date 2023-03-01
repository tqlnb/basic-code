package com.tql.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos  = new FileOutputStream("day28-code\\b.txt");
        //fos.write(97);
        byte[] bytes = {97 ,98 ,99 , 100, 101};
        //fos.write(bytes);

        fos.write(bytes , 1 , 2);

        fos.close();
    }
}
