package com.tql.demo1;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
* 打包工具类,打包项目app文件
*
* */
public class AppPacker {

    private static String projectPa = "";

    /**
     * 打包app
     * @param outputPath 输出路径
     * @param outputFileName 输出文件名
     * @param overwrite 是否覆盖
     * @param libPath lib路径
     * @param resourceFiles 所有资源文件,appxmlEditor的resource文件和选中的后面板apml文件
     * @param projectPath 项目路径,用于帮助打包app时,将项目中的资源文件路径转换为相对路径
     * @throws IOException 捕获IO异常
     */
    public static void packApp(String outputPath, String outputFileName, boolean overwrite, String libPath, List<String> resourceFiles,String projectPath) throws IOException {
        projectPa = projectPath;
        // Prepare the output file
        File outputFile = new File(outputPath, outputFileName + ".app");

        if (!overwrite && outputFile.exists()) {
            System.out.println("Output file already exists. Skipping packaging.");
            return;
        }

        // Create the parent directories if they don't exist
        outputFile.getParentFile().mkdirs();

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(outputFile))) {
            // Pack lib files
            packLibFiles(zipOutputStream, libPath);

            // Pack resource files
            packResourceFiles(zipOutputStream, resourceFiles);
        }

        System.out.println("App packaging completed.");
    }

    /**
     * 打包lib文件
     * @param zipOutputStream 输出流
     * @param libPath lib路径
     * @throws IOException 捕获IO异常
     */
    private static void packLibFiles(ZipOutputStream zipOutputStream, String libPath) throws IOException {
        File libDirectory = new File(libPath);
        if (!libDirectory.exists() || !libDirectory.isDirectory()) {
            System.err.println("Invalid lib path.");
            return;
        }

        packFilesInDirectory(zipOutputStream, libDirectory, "lib");
    }

    /**
     * 打包资源文件
     * @param zipOutputStream 输出流
     * @param resourceFiles 资源文件
     * @throws IOException 捕获IO异常
     */
    private static void packResourceFiles(ZipOutputStream zipOutputStream, List<String> resourceFiles) throws IOException {
        for (String resourceFile : resourceFiles) {
            File file = new File(resourceFile);
            if (file.exists()) {
                packFile(zipOutputStream, file, "project");
            }
        }
    }

    /**
     * 通过文件夹路径打包文件夹下所有文件,使用递归
     * @param zipOutputStream 输出流
     * @param directory 文件夹
     * @param baseEntryPath 打包输出路径
     */
    private static void packFilesInDirectory(ZipOutputStream zipOutputStream, File directory, String baseEntryPath) throws IOException {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    packFile(zipOutputStream, file, baseEntryPath);
                } else if (file.isDirectory()) {
                    String newBaseEntryPath = baseEntryPath + File.separator + file.getName();
                    packFilesInDirectory(zipOutputStream, file, newBaseEntryPath);
                }
            }
        }
    }

    /**
     * 打包普通文件
     * @param zipOutputStream 输出流
     * @param file 要打包的文件
     * @param baseEntryPath 打包输出路径
     * @throws IOException 捕获IO异常
     */
    private static void packFile(ZipOutputStream zipOutputStream, File file, String baseEntryPath) throws IOException {
        String relativePath = baseEntryPath + File.separator + getRelativePath(file);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            ZipEntry entry = new ZipEntry(relativePath);
            zipOutputStream.putNextEntry(entry);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, length);
            }

            zipOutputStream.closeEntry();
        }
    }

    /**
     * 获取相对路径(lib文件夹相对于"lib",资源文件相对于项目路径)
     * @param file 文件
     * @return 相对路径
     */
    private static String getRelativePath(File file) {
        String absolutePath = file.getAbsolutePath();
        if(absolutePath.startsWith(projectPa)){
            return absolutePath.substring(projectPa.length() + 1);
        }else {
            return absolutePath.substring(absolutePath.indexOf("lib") + 5);
        }
        //return absolutePath.substring(absolutePath.indexOf(File.separator) + 1);
    }
}
