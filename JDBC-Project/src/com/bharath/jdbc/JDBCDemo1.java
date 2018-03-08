package com.bharath.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) {
		//Connection con=null;
		
		
		try (Connection con=DriverManager.getConnection("jdbc:postgresql://bharathdb.cxlej4ca0qoh.us-east-1.rds.amazonaws.com:5432/BharathDB","Bharath309","Bharath309");
				Statement stmt=con.createStatement(); ){
			//1. Load the driver class
			Class.forName("org.postgresql.Driver");
			
			//2.Establish the connection
			
			
			//3.Create the Statement
			
			//4. Prepare the Query
			String selectQuery= "select * from invoice";
			ResultSet rs=stmt.executeQuery(selectQuery);
			//5. Process the result
			while (rs.next()) {
				System.out.println(rs.getString(1));
				//System.out.println(rs.getInt("ID")+" "+rs.getString("NAME")+" "+rs.getInt("salary"));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
