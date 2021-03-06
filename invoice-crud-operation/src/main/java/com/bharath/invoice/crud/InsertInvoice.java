package com.bharath.invoice.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertInvoice {
	Connection con=null;
	PreparedStatement psmt=null;
	private static final String INSERT_INVOICE_RECORD="INSERT INTO INVOICE VALUES(?,?,?,?,?,?,?)";

	public int insertInvoiceRecord(Invoice invoice) {
		//InvoiceCrudRepo incr=new InvoiceCrudRepo();
		con=InvoiceCrudRepo.getConnection();
		int result=0;
		try {
			psmt=con.prepareStatement(INSERT_INVOICE_RECORD);

			psmt.setInt(1, invoice.id);
			psmt.setString(2,invoice.firstName);
			psmt.setString(3,invoice.productName);
			psmt.setDouble(4,invoice.productCost);
			psmt.setDouble(5,invoice.discount);
			psmt.setString(6,invoice.transactionType);
			psmt.setString(7,invoice.decision);
			result=psmt.executeUpdate();

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
		return result;

	}

	

	
}
