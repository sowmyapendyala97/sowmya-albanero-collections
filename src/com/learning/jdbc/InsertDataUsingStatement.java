package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataUsingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cm=DriverManager.getConnection("jdbc:mysql://localhost:3306/devdb", "root", "password");
			Statement s=cm.createStatement();
			int value=s.executeUpdate("insert into employee values(7,41,'aayan','K')");
			System.out.println(value);
			cm.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
