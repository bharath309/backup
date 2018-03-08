package com.bharath.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InvoiceCRUDOperation {
	Connection con=null;
	private static final String CREATE_INVOICE_STRUCTURE="CREATE TABLE INVOICE(id integer constraint invky primary key, cname varchar(18), pname varchar(18), cost real, discount real,transaction_type varchar(18));";
	private static final String INSERT_INVOICE_RECORD="INSERT INTO INVOICE VALUES(?,?,?,?,?,?)";
	private static final String UPDATE_DISCOUNT="UPDATE INVOICE SET discount=160.40 where cname=?";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		InvoiceCRUDOperation ico=new InvoiceCRUDOperation();
		ico.createInvoiceStructure();

	}
	private Connection getConnection() {
		try {
			//1. Load the driver class
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://bharathdb.cxlej4ca0qoh.us-east-1.rds.amazonaws.com:5432/BharathDB","Bharath309","Bharath309");
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	private void createInvoiceStructure() throws SQLException {
		Statement stmt=null;
		try {
			
				con=getConnection();
				stmt=con.createStatement();
				DatabaseMetaData dbm=con.getMetaData();
				ResultSet rs=dbm.getTables(null, null, "invoice", null);
						if(rs.next()) {
							System.out.println("The table is already exist");
						}else {
							boolean result =stmt.execute(CREATE_INVOICE_STRUCTURE);
							System.out.println("table hasbeen created");
						}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			try {
				stmt.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

	}
}

