package com.codegnan.iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamExample {

	public static void main(String[] args) {
	String filePath="jfs41bos.txt";
	String content="Java programming was developed by james gosling in 1995.\n"
			+"It is most powerful programming language.\n"
			+"Write Once Run Anywhere.\n"
			+"Memory cleanup";
	try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(filePath))){
		byte[] data=content.getBytes();
		bos.write(data);
		System.out.println("Data Written to file secessfully.");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
