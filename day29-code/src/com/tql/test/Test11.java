package com.tql.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Test11 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("day29-code\\a.txt"), true , Charset.forName("UTF-8"));

        ps.println(97);
        ps.printf("%s 爱上了 %s","阿珍","阿强");


        ps.close();


    }
}
