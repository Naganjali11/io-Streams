package com.codegnan.iostreams;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		try(PrintWriter out= new PrintWriter("Output.txt")){
			out.println("Hello java");
			out.println("Hai");
			out.print(10);
			out.println('a');
			out.println(false);
			out.println(97);
			System.out.println("data written to a file sucessfully");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
