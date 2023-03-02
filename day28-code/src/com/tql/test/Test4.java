package com.tql.test;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹
        //1.创建对象表示数据源
        File fileIn = new File("D:\\aaa");
        //2.创建对象表示目的地
        File fileOut = new File("D:\\bbb");

        copyDir(fileIn , fileOut);

    }

    /*
    * 作用:拷贝文件夹
    * 参数1:数据源
    * 参数2:目的地
    *
    * */
    private static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();
        //递归
        //1.进入数据源
        File[] files = src.listFiles();
        //2.遍历数组
        if(files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    //3.判断文件:拷贝
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(dest , file.getName()));
                    byte[] bytes = new byte[1024];
                    int len;

                    while ((len = fis.read()) != -1){
                        fos.write(bytes , 0 , len);
                    }
                    fos.close();
                    fis.close();
                }
                if (file.isDirectory()){
                    //4.判断文件夹:递归
                    copyDir(file , new File(dest , file.getName()));
                }
            }
        }
    }

}
