package com.bharath.jdbcpractice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InvoiceCRUDRepo {
	public static final String CREATE_INVOICE_STRUCTURE="CREATE TABLE INVOICE(id integer constraint invky primary key, cname varchar(18), pname varchar(18), cost real, discount real,transaction_type varchar(18));";
	public static final String EXISTING_TABLE_CHECK="SELECT EXISTS( SELECT FROM information_schema.tables WHERE  table_name = 'invoice');" ;
	private static final String INSERT_INVOICE_RECORD="INSERT INTO INVOICE VALUES(?,?,?,?,?,?)";
	private static final String UPDATE_DISCOUNT="UPDATE INVOICE SET discount=60.40 where cname=?";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);

		InvoiceCRUDRepo icr=new InvoiceCRUDRepo();
		icr.createInvoiceStructure();
		JdbcConnectiontoLocalserver read=new JdbcConnectiontoLocalserver();
		read.readInvoiceRecord();
		int a=10;
		System.out.println("Enter a '10' for update or Enter any character except '10' to inserting values");
		int b=in.nextInt();
		
		if(a==b) {
		icr.updateInvoiceRecord();
		read.readInvoiceRecord();
		}else {
		icr.insertInvoiceRecord();
		read.readInvoiceRecord();
		}
	}
	Connection con=null;
	Statement stmt=null;
	PreparedStatement psmt=null;
	//This method for Database Connectivity
	public Connection getConnection() {
		
		try {
			//1. Load the driver class
			Class.forName("org.postgresql.Driver");
			//2.Establish the connection
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBCTest","postgres" , "1234");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
		
	}
	public void createInvoiceStructure() {
		
		
		con=getConnection();
		try {
			stmt=con.createStatement();
			DatabaseMetaData dbm=con.getMetaData();
			ResultSet rs=dbm.getTables(null, null,"invoice", null);
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
	public void insertInvoiceRecord() {
		con=getConnection();
		//int result=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your Id number");
		int id=in.nextInt();
		System.out.println("Enter your name");
		String cname=in.next();
		
		System.out.println("Enter your product name");
		String pname=in.next();
		
		System.out.println("Enter product cost");
		double cost=in.nextDouble();
		
		System.out.println("Enter Eligible Discount ");
		double discount=in.nextDouble();
		
		System.out.println("Enter your paying type either 'card' or 'cash'");
		String transaction=in.next();
		
		//int id1=0;
		try {
		
			/*String selectQuery= "select * from invoice where id=";
			ResultSet rs=stmt.executeQuery(selectQuery);

			while(rs.absolute(id)) {
				System.out.println("this id is already exist enter another id");
				 
			}*/
			Invoice invc=new Invoice(id, cname, pname, cost, discount, transaction);
			psmt=con.prepareStatement(INSERT_INVOICE_RECORD);

			psmt.setInt(1, invc.getId());
			psmt.setString(2, invc.getCname());
			psmt.setString(3, invc.getPname());
			psmt.setDouble(4, invc.getCost());
			psmt.setDouble(5, invc.getDiscount());
			psmt.setString(6, invc.getTransaction());
			
			
			psmt.execute();
			//result=psmt.executeUpdate();
			//System.out.println(result);
			System.out.println("table values successfully inserted ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//return result;
		
	}
	public void updateInvoiceRecord() {
		con=getConnection();
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name");
		String cname=in.next();
		
		
		
		
		Invoice invc=new Invoice(cname);

		
		try {
			psmt=con.prepareStatement(UPDATE_DISCOUNT);
			
			psmt.setString(1, invc.getCname());
			
			psmt.executeUpdate();
			
			System.out.println("your value is updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


}
