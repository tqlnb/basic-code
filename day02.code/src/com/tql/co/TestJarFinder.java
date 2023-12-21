package com.tql.co;

import java.io.File;
import java.util.StringJoiner;

public class TestJarFinder {
    public static void main(String[] args) {
        TestJarFinder tjf = new TestJarFinder();
        String dir = "G:\\gitrepo\\smartDev\\SmartBoxDesktop";
        StringJoiner stringJoiner = new StringJoiner(File.pathSeparator);
        tjf.makeClasspathFromDir(dir, stringJoiner);

    }

    private void makeClasspathFromDir(String dir, StringBuilder cpBuilder) {
        File f = new File(dir);
        // 从目录中添加以.jar结尾的文件
        if (f.isDirectory()) {
            for (File jar : f.listFiles()) {
                if (jar.getName().endsWith(".jar") || jar.getName().endsWith(".so")) {
                    if (cpBuilder.length() > 0) {
                        cpBuilder.append(File.pathSeparator);
                    }
                    cpBuilder.append(jar.getAbsolutePath());
                }
                if (jar.isDirectory()) {
                    makeClasspathFromDir(jar.getAbsolutePath(), cpBuilder);
                }
            }
        }
    }

    /**
     * @param dir      指定的目录
     * @param stringJoiner StringJoiner,分隔符使用File.pathSeparator
     * @return void
     * @date 2023/10/16 10:54
     * @description  遍历目录将Jar文件和so文件加入Classpath字符串
     */
    private void makeClasspathFromDir(String dir, StringJoiner stringJoiner) {
        File f = new File(dir);
        // 从目录中添加以.jar结尾的文件
        if (f.isDirectory()) {
            for (File jar : f.listFiles()) {
                if (jar.getName().endsWith(".jar") || jar.getName().endsWith(".so")) {
                    stringJoiner.add(jar.getAbsolutePath());
                }
                if (jar.isDirectory()) {
                    makeClasspathFromDir(jar.getAbsolutePath(), stringJoiner);
                }
            }
        }
    }

}
