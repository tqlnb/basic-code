package com.tql.demo1;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class AppPackager {

    public static void pack(String outputPath, String outputFileName, boolean overwrite,
                            String libPath, String projectPath, List<String> resourceFiles) throws IOException {
        File outputFolder = new File(outputPath);
        if (!outputFolder.exists()) {
            outputFolder.mkdirs();
        }

        File outputFile = new File(outputFolder, outputFileName);
        if (!overwrite && outputFile.exists()) {
            throw new IOException("Output file already exists.");
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(outputFile))) {
            addFilesToZip(zipOutputStream, new File(projectPath), "", libPath, resourceFiles);
        }
    }

    private static void addFilesToZip(ZipOutputStream zipOutputStream, File file, String currentPath,
                                      String libPath, List<String> resourceFiles) throws IOException {
        if (file.isDirectory()) {
            if (!currentPath.isEmpty()) {
                String entryName = currentPath + "/";
                ZipEntry zipEntry = new ZipEntry(entryName);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.closeEntry();
            }

            File[] files = file.listFiles();
            for (File subFile : files) {
                String newPath = currentPath + (currentPath.isEmpty() ? "" : "/") + subFile.getName();
                addFilesToZip(zipOutputStream, subFile, newPath, libPath, resourceFiles);
            }
        } else {
            String entryPath = currentPath;
            if (!currentPath.isEmpty()) {
                entryPath += "/";
            }
            entryPath += file.getName();

            if (entryPath.equals(libPath)) {
                return; // Exclude the lib folder from the zip
            }

            ZipEntry zipEntry = new ZipEntry(entryPath);
            zipOutputStream.putNextEntry(zipEntry);

            try (FileInputStream inputStream = new FileInputStream(file)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    zipOutputStream.write(buffer, 0, length);
                }
            }

            zipOutputStream.closeEntry();
        }
    }
}