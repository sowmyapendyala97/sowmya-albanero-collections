package com.learning.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDataUsingPrepareStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cm=DriverManager.getConnection("jdbc:mysql://localhost:3306/devdb", "root", "password");
			PreparedStatement s=cm.prepareStatement("delete from employee where id=?;");
			
		
			
			
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("enter id");
				String s1=bf.readLine();  
				int id=Integer.parseInt(s1); 
				
				
				s.setInt(1, id);
				int value=s.executeUpdate();
				
				  
				System.out.println("Want to delete more records y/n");  
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
