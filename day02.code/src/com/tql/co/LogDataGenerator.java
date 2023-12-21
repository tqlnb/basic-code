package com.tql.co;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogDataGenerator {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\tql\\Desktop\\workspace\\aaa\\in\\2.txt"; // 指定文件名

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            double minValue = 0.001; // 防止log(0)的情况，从一个小的正数开始
            double maxValue = Math.pow(Math.E, 1.0) - 1.0; // log(e) = 1
            double range = maxValue - minValue;

            for (int i = 0; i < 100; i++) {
                double x = minValue + (range / 99) * i;
                double logValue = Math.log(x);
                double scaledValue = 2.0 * (logValue - Math.log(minValue)) / (Math.log(maxValue) - Math.log(minValue)) - 1.0;
                printWriter.println(scaledValue);
            }

            printWriter.close();
            System.out.println("数据已写入文件: " + fileName);
        } catch (IOException e) {
            System.err.println("写入文件时发生错误: " + e.getMessage());
        }
    }
}
