package com.codegnan.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        String filePath = "jfs41fos.txt";
        String content = "hello jfs41 batch.\n"
                + "java programming is very easy.\n"
                + "when it?.\n"
                + "you make practice";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] data = content.getBytes();
            fos.write(data);
            System.out.println("File created and data successfully written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
