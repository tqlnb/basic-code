package com.tql.test;

import com.tql.myzipstream.ZipStreamDemo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test12 {
    public static void main(String[] args) throws IOException {
        File src = new File("F:\\安装说明.txt");
        File dest = new File("F:\\");

        ZipStreamDemo2.toZip(src , dest);

    }

    private static void toZipp(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest , "安装说明.zip")));
        ZipEntry entry = new ZipEntry("a.txt");
        zos.putNextEntry(entry);

        FileInputStream fio = new FileInputStream(src);
        int b;
        while ((b = fio.read()) != -1){
            zos.write(b);
        }



    }

}
