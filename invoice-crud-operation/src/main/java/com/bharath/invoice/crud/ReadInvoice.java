package com.bharath.invoice.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadInvoice {
	InvoiceCrudRepo incr=new InvoiceCrudRepo();
	Connection con=null;
	Statement stmt=null;
	public String readInvoiceRecord() {
		con=incr.getConnection();
		String result=null;
		//List<Invoice> lsivc=new ArrayList<>();
		try {
			stmt=con.createStatement();
			String selectQuery= "select * from invoice";
			ResultSet rs = stmt.executeQuery(selectQuery);
			//5. Process the result
			result="<table border='1'class=\"table table-striped\"> <tr><th>CustomerID</th><th>CustomerName</th><th>ProductNmae</th><th>ProductCost</th><th>Discount</th><th>TransactionType</th><th>Decision</th>";
			while (rs.next()) {
				result+="<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td><a href=\"updateform.jsp?id=${inv.getId()}\">Edit</a></td> <td><a href=\"deleteuser.jsp?id=${inv.getId()}\">Delete</a></td></tr>";
				
				//System.out.println(rs.getInt(1)+" "+String.format("%-10s", rs.getString(2))+" "+String.format("%-10s",rs.getString(3))+" "+rs.getDouble(4)+" "+rs.getDouble(5)+" "+String.format("%10s", rs.getString(6)));
				/*int id = rs.getInt(1);
				String firstName = rs.getString(2);
				String productName = rs.getString(3);
				double cost = rs.getDouble(4);
				double discount=rs.getDouble(5);
				String transactionType=rs.getString(6);
				String decision=rs.getString(7);
				
				Invoice ivc=new Invoice(id, firstName, productName, cost, discount, transactionType, decision);
				lsivc.add(ivc);*/
			}
			
			result+="</table>";

		} catch (SQLException e1) {			
			e1.printStackTrace();
		}	
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return str;
		return result;
	}
}


