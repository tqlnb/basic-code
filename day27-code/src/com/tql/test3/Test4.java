package com.tql.test3;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa\\src");
        delete(file);
    }

    public static void delete(File src){
        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.print(file.getAbsolutePath() + "删除:");
                System.out.println(file.delete());
            } else {

                    delete(file);

            }
        }
        System.out.print(src.getAbsolutePath() + "删除:");
        System.out.println(src.delete());
    }
}
