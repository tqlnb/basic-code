package com.tql.co;

import java.io.File;
import java.io.FilenameFilter;

/*
* 这个类的主要目的是在文件操作时，比如列出目录下特定类型的文件，或者从目录中筛选出特定类型的文件。
* 使用这个类，你可以通过实例化 FileTypeFilter 并传入所需的文件类型来创建一个文件过滤器，然后将其应用到文件操作中。
* */
public class FileTypeFilter implements FilenameFilter {
	String type;
	
	public FileTypeFilter(String type) {
		this.type = "." + type;
	}
	
	@Override
	public boolean accept(File arg0, String arg1) {
		if (arg1.endsWith(type)) {
			return true;
		} else {
			return false;
		}
	}

}

