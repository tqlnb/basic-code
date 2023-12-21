package com.tql.co;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CosDataGenerator {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\tql\\Desktop\\workspace\\aaa\\in\\3.txt"; // 指定文件名

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < 100; i++) {
                double x = i * 0.1; // x的取值从0到10，步长为0.1
                double cosValue = Math.cos(x);
                printWriter.println(cosValue);
            }

            printWriter.close();
            System.out.println("数据已写入文件: " + fileName);
        } catch (IOException e) {
            System.err.println("写入文件时发生错误: " + e.getMessage());
        }
    }
}
