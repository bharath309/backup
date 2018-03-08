
package com.bharath.invoice.crud;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Scanner;



public class InvoiceCrudRepo {

	public static final String CREATE_INVOICE_STRUCTURE="CREATE TABLE INVOICE(id integer constraint invky primary key, cname varchar(18), pname varchar(18), cost real, discount real,transaction_type varchar(18),decision varchar(5));";

	static Connection con=null;
	Statement stmt=null;
	static PreparedStatement psmt=null;
	//This method for Database Connectivity
	public static Connection getConnection() {		
		try {
			//1. Load the driver class0
			Class.forName("org.postgresql.Driver");
			//2.Establish the connection
			con=DriverManager.getConnection("jdbc:postgresql://bharathdb.cxlej4ca0qoh.us-east-1.rds.amazonaws.com:5432/BharathDB","Bharath309","Bharath309");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {			
			e.printStackTrace();
		}	
		return con;	
	}
	public void createInvoiceStructure() {
		con=getConnection();
		try {
			stmt=con.createStatement();
			DatabaseMetaData dbm=con.getMetaData();
			ResultSet rs=dbm.getTables(null, null,"Invoice", null);
			if(rs.next()) {
				System.out.println("table is already exist now skipping");
			}
			else {
				stmt.execute(CREATE_INVOICE_STRUCTURE);
				System.out.println("table created");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static Invoice getRecordById(int id) {
		Invoice inv=null;
		con=getConnection();
        try {
			psmt=con.prepareStatement("select * from invoice where id=?");
			psmt.setInt(1, id);
	        ResultSet rs=psmt.executeQuery();  
	        while(rs.next()){  
	        	inv=new Invoice();
	        	inv.setId(rs.getInt(1));
	        	inv.setFirstName(rs.getString(2));
	        	inv.setProductName(rs.getString(3));
	        	inv.setProductCost(rs.getDouble(4));
	        	inv.setDiscount(rs.getDouble(5));
	        	inv.setTransactionType(rs.getString(6));
	        	inv.setDecision(rs.getString(7));
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		try {
			con.close();
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inv;
	}	
}
