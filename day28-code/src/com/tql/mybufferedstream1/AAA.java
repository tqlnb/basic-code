package com.tql.mybufferedstream1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class AAA {
    public static void main(String[] args) throws IOException {

        File src = new File("D:\\aaa");
        File dest = new File("D:\\");
        zip(src, dest);
    }

    public static void zip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, src.getName() + ".zip")));
        zip0(src, zos, src.getName());
        zos.close();
    }


    public static void zip0(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                zos.putNextEntry(new ZipEntry(name + "\\" + file.getName()));
                int len;
                byte[] bytes = new byte[1024];
                while ((len = fis.read(bytes)) != -1) {
                    zos.write(bytes,0,len);
                }
                zos.closeEntry();
                fis.close();
            } else {
                zip0(file, zos, name + "\\" + file.getName());
            }
        }
    }
}
