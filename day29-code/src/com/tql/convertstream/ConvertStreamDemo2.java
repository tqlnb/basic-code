package com.tql.convertstream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
        */

/*    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day29-code\\change.txt") , "GBK");
    osw.write("你好你好");
    osw.close();*/

        FileWriter fw = new FileWriter("day29-code\\change.txt" , Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
    }
}
