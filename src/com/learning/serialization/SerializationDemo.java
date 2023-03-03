package com.learning.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Product p =new Product(78, "Chairs");
		FileOutputStream ft = new FileOutputStream("file.txt");
		
		ObjectOutputStream ot=new ObjectOutputStream(ft);
		ot.writeObject(p);
		ot.flush();
		
		ot.close();
		System.out.println("sucess");
		}

}
