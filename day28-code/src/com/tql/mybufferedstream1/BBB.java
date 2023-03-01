package com.tql.mybufferedstream1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class BBB {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\aaa.zip");
        File dest = new File("E:\\");

        zip(src, dest);
    }


    public static void zip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        zip0(zip, dest);
        zip.close();
    }

    private static void zip0(ZipInputStream zip, File dest) throws IOException {
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            File file = new File(dest, entry.toString());
            new File(file.getParent()).mkdirs();
            FileOutputStream fos = new FileOutputStream(file);

            byte[] bytes = new byte[1024];
            int len;
            while ((len = zip.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }
            zip.closeEntry();
            fos.close();
        }

    }


}
