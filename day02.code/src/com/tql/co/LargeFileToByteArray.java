package com.tql.co;

import java.io.*;

public class LargeFileToByteArray {
    public static void main(String[] args) {
        String filePath = "your_large_file_path_here"; // 替换为你的大文件路径
        int bufferSize = 1024; // 每次读取的字节数

        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }

            byte[] byteArray = byteArrayOutputStream.toByteArray();

            fileInputStream.close();
            byteArrayOutputStream.close();

            System.out.println("字节数组长度: " + byteArray.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
