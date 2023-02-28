package com.tql.test3;

import java.io.File;

public class test3 {
    public static void main(String[] args) {
        File src = new File("c:\\");
        findAVI(src);
    }

    public static void findAVI(File src){
        File[] files = src.listFiles();
        if(files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else if (file.isDirectory()) {
                    findAVI(file);
                }
            }
        }
    }
}
