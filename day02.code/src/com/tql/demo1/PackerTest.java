package com.tql.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PackerTest {
    public static void createPackage(String outputPath, String outputFileName, boolean overwrite, String libPath, String projectPath, List<String> resourceFiles) throws IOException {
        // Check if the output file already exists
        File outputFile = new File(outputPath, outputFileName);
        if (outputFile.exists() && !overwrite) {
            System.out.println("Output file already exists. To overwrite, set the 'overwrite' flag to true.");
            return;
        }

        // Create the output directory if it doesn't exist
        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().mkdirs();
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(outputFile))) {
            // Pack resources
            for (String resourceFile : resourceFiles) {
                File file = new File(projectPath, resourceFile);
                if (file.exists()) {
                    addToZip(zipOutputStream, file, projectPath);
                }
            }

            // Pack lib folder
            File libFolder = new File(libPath);
            if (libFolder.exists() && libFolder.isDirectory()) {
                for (File libFile : libFolder.listFiles()) {
                    addToZip(zipOutputStream, libFile, libPath);
                }
            }
        }

        System.out.println("Package created successfully: " + outputFile.getAbsolutePath());
    }

    private static void addToZip(ZipOutputStream zipOutputStream, File fileToAdd, String baseDir) throws IOException {
        if (fileToAdd.isDirectory()) {
            for (File file : fileToAdd.listFiles()) {
                addToZip(zipOutputStream, file, baseDir);
            }
        } else {
            String entryName = fileToAdd.getAbsolutePath().replace(baseDir, "");
            entryName = entryName.startsWith(File.separator) ? entryName.substring(1) : entryName;

            ZipEntry zipEntry = new ZipEntry(entryName);
            zipOutputStream.putNextEntry(zipEntry);

            try (FileInputStream fileInputStream = new FileInputStream(fileToAdd)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fileInputStream.read(buffer)) > 0) {
                    zipOutputStream.write(buffer, 0, length);
                }
            }

            zipOutputStream.closeEntry();
        }
    }

}
