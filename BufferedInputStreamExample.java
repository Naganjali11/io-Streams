package com.codegnan.iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		String filepath="jfs41bos.txt";
		try(BufferedInputStream bos=new BufferedInputStream(new FileInputStream(filepath))){
			int byteData;
			while((byteData=bos.read())!=-1) {
				System.out.print((char) (byteData));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
