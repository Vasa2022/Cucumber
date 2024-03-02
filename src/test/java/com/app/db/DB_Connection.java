package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connection {
	
	public static void db_connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "Saikalai@123");
			System.out.println("connected");
			Statement statement = connection.createStatement();
			String query ="Select * from world.city;";
		//	String query ="Select count(Percentage) as Percentage_Count from world.countrylanguage;";
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString("Name")+" "+ rs.getString(3) );
			
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		db_connect();
	}
	

}
