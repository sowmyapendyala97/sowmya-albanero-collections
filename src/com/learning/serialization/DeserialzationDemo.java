package com.learning.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialzationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ObjectInputStream obj=new ObjectInputStream(new FileInputStream("file.txt"));
			
				Product p =(Product) obj.readObject();
				System.out.print(p.getId() +" "+p.getProdName());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
