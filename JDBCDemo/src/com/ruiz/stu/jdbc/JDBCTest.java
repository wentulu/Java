package com.ruiz.stu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("123");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Student?useSSL=false", "root", "ruiz123456");
			Statement statement = connection.createStatement();
			System.out.println("begin");
			ResultSet resultSet = statement.executeQuery("select * from student");
			
			System.out.println("result set");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) +"\t"+resultSet.getInt(2));
			}
			
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
