package com.bharath.invoice.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteInvoiceRecord {

	InvoiceCrudRepo incr=new InvoiceCrudRepo();
	Connection con=null;
	PreparedStatement ps=null;
	public void deleteInvoicerecord(String invoiceId) {
		
		con=incr.getConnection();
		
		String sql="delete from invoice where id=?";
		try {
			int id=Integer.parseInt(invoiceId);
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
