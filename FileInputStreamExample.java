package com.codegnan.iostreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		String filePath="jfs41fos.txt";
		try(FileInputStream fos=new FileInputStream(filePath)){
			int byteData;
			while((byteData=fos.read())!=-1) {
				System.out.print((char)(byteData));
			}
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
	}

}
