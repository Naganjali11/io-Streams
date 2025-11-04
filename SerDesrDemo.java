package com.codegnan.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee(11,"Malli",60000,"Hyderabad");
		System.out.println("Before Serialization Employee Details");
		emp1.displayemployeeDetails();
		String filePath="emp.txt";
		try(FileOutputStream fos=new FileOutputStream(filePath);
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(emp1);;
			System.out.println("Serialized Object:"+emp1);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("De-Serialization Process");
		try(FileInputStream fis=new FileInputStream(filePath);
				ObjectInputStream ois=new ObjectInputStream(fis)){
				Employee emp2=(Employee)ois.readObject();
				System.out.println("After De-Serialization Employee Details:");
				emp2.displayemployeeDetails();
				System.out.println("De-Serialization Object:"+emp2);
		} catch (IOException |ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
