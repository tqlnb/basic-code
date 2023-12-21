package com.tql.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class AppPackerUtil1 {

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
            addFilesToZip(zipOutputStream, new File(projectPath), projectPath, libPath, resourceFiles);
        }
    }

    private static void addFilesToZip(ZipOutputStream zipOutputStream, File file, String projectPath,
                                      String libPath, List<String> resourceFiles) throws IOException {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File subFile : files) {
                addFilesToZip(zipOutputStream, subFile, projectPath, libPath, resourceFiles);
            }
        } else {
            String entryPath = file.getAbsolutePath().replace(projectPath, "");

            if (resourceFiles.contains(entryPath)) {
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

}
