package com.bharath.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectiontoLocalserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcConnectiontoLocalserver read=new JdbcConnectiontoLocalserver();
		read.readInvoiceRecord();
		
	}
	public void readInvoiceRecord() {
		Connection con=null;
		Statement stmt=null;
		//con=DriverManager.getConnection(url, user, password)
		try {
			//1. Load the driver class
			Class.forName("org.postgresql.Driver");
			//2.Establish the connection
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBCTest","postgres" , "1234");
			//3.Create the Statement
			stmt=con.createStatement();
			//4. Prepare the Query
			String selectQuery= "select * from invoice";
			ResultSet rs=stmt.executeQuery(selectQuery);
			//5. Process the result
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+String.format("%-10s", rs.getString(2))+" "+String.format("%-10s",rs.getString(3))+" "+rs.getDouble(4)+" "+rs.getDouble(5)+" "+String.format("%10s", rs.getString(6)));
				//System.out.println(rs.getInt("ID")+" "+rs.getString("NAME")+" "+rs.getInt("salary"));
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
