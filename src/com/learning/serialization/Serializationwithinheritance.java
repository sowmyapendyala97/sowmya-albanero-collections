package com.learning.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializationwithinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	try {
		ProductDetials pd=new ProductDetials(4, "Baskets", 74, 5.25);
		
		FileOutputStream ft = new FileOutputStream("file.txt");
		
		ObjectOutputStream obj=new ObjectOutputStream(ft);
		
		obj.writeObject(pd);
		obj.flush();
		obj.close();
		System.out.println("success");    
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
