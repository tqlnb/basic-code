package com.tql.demo1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String projectPath = "C:\\Users\\tql\\Desktop\\workspace\\aaa";
        List<String> resourceFiles = new ArrayList<>();
        resourceFiles.add("C:\\Users\\tql\\Desktop\\workspace\\aaa\\aaa.project");
        resourceFiles.add("C:\\Users\\tql\\Desktop\\workspace\\aaa\\后面板\\22222.apml");
        //PackageUtil.pack("G:\\test\\packageOut","test818",true,"G:\\test\\packageOut\\libs",projectPath,resourceFiles);
        //AppPackerUtil1.pack("G:\\test\\packageOut","test818.app",true,"G:\\test\\packageOut\\libs",projectPath,resourceFiles);
        //PackerTest.createPackage("G:\\test\\packageOut","test818.app",true,"G:\\test\\packageOut\\libs",projectPath,resourceFiles);
        AppPacker.packApp("G:\\test\\packageOut","test818",true,"G:\\test\\packageOut\\libs",resourceFiles,projectPath);
    }
}
