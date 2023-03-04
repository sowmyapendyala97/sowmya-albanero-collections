package com.learning.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDataPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cm=DriverManager.getConnection("jdbc:mysql://localhost:3306/devdb", "root", "password");
			PreparedStatement s=cm.prepareStatement("insert into employee values(?,?,?,?)");
			
		
			
			
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("enter id");
				String s1=bf.readLine();  
				int id=Integer.parseInt(s1);  
				
				System.out.println("enter age");
				//int age=bf.read();
				String s2=bf.readLine();  
				int age=Integer.parseInt(s2);  
				
				System.out.println("enter fname");
				String fname=bf.readLine();
				
				System.out.println("enter lname");
				String lname=bf.readLine();
				
				s.setInt(1, id);
				s.setInt(2, age);
				s.setString(3, fname);
				s.setString(4, lname);
				int value=s.executeUpdate();
				
				  
				System.out.println("Want to add more records y/n");  
				String ans=bf.readLine();  
				if(ans.equals("n")){  
				break;  
				}  
				  
				}  
			
		//	System.out.println(value);
			cm.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
