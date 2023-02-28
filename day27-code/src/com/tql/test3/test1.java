package com.tql.test3;

import java.io.File;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        File f = new File("myFile\\aaa");
        File src = new File(f , "a.txt");
        System.out.println(src.createNewFile());
    }
}
