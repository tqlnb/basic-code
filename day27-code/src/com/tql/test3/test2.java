package com.tql.test3;

import java.io.File;
import java.io.FileFilter;

public class test2 {
    public static void main(String[] args) {
        File f =new File("D:\\aaa");
        File[] avi = findAvi(f);
        System.out.println(avi.toString());
    }

    public static File[] findAvi(File f){
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".avi") && f.isFile();
            }
        });
        return files;
    }
}
