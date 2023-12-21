package com.tql.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PackageUtil {
    public static void pack(String sourceFolderPath, String outputFileName, boolean overwrite,
                            String libPath, String projectPath, List<String> resourceFiles) throws IOException {
        File sourceFolder = new File(sourceFolderPath);
        if (!sourceFolder.isDirectory()) {
            throw new IllegalArgumentException("Source folder path is not a directory.");
        }

        File outputFile = new File(outputFileName);
        if (!overwrite && outputFile.exists()) {
            throw new IOException("Output file already exists.");
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(outputFile))) {
            addFilesToZip(zipOutputStream, sourceFolder, sourceFolder, libPath, projectPath, resourceFiles);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addFilesToZip(ZipOutputStream zipOutputStream, File rootFolder, File currentFolder,
                                      String libPath, String projectPath, List<String> resourceFiles) throws IOException {
        File[] files = currentFolder.listFiles();
        byte[] buffer = new byte[1024];

        for (File file : files) {
            if (file.isDirectory()) {
                addFilesToZip(zipOutputStream, rootFolder, file, libPath, projectPath, resourceFiles);
            } else {
                String relativePath = file.getAbsolutePath().substring(rootFolder.getAbsolutePath().length() + 1);

                if (relativePath.equals(libPath)) {
                    continue; // Exclude the lib folder from the zip
                }

                String entryPath = projectPath + File.separator + relativePath;
                ZipEntry zipEntry = new ZipEntry(entryPath);
                zipOutputStream.putNextEntry(zipEntry);

                try (FileInputStream inputStream = new FileInputStream(file)) {
                    int length;
                    while ((length = inputStream.read(buffer)) > 0) {
                        zipOutputStream.write(buffer, 0, length);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }

                zipOutputStream.closeEntry();
            }
        }

        // Add resource files to the zip
        for (String resourceFile : resourceFiles) {
            File file = new File(projectPath, resourceFile);
            if (file.exists()) {
                String entryPath = projectPath + File.separator + resourceFile;
                ZipEntry zipEntry = new ZipEntry(entryPath);
                zipOutputStream.putNextEntry(zipEntry);

                try (FileInputStream inputStream = new FileInputStream(file)) {
                    int length;
                    while ((length = inputStream.read(buffer)) > 0) {
                        zipOutputStream.write(buffer, 0, length);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }

                zipOutputStream.closeEntry();
            }
        }
    }
}
