package com.bharath.invoice.crud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InvoiceServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String firstName=req.getParameter("fname");
		String productName=req.getParameter("pname");
		String pcost=req.getParameter("cost");
		double productCost=Double.parseDouble(pcost);
		String discount1=req.getParameter("discount");
		double discount=Double.parseDouble(discount1);
		String transactionType=req.getParameter("dropdownlist");
		String decision=req.getParameter("checkbox");
		String ids=req.getParameter("id");
		int id=Integer.parseInt(ids);
		
		InvoiceCrudRepo incr=new InvoiceCrudRepo();
		incr.createInvoiceStructure();
		Invoice invoice=new Invoice(id, firstName, productName, productCost, discount, transactionType, decision);
		ReadInvoice ri=new ReadInvoice();
		
		InsertInvoice insrt= new InsertInvoice();
		int value=0;
		value=insrt.insertInvoiceRecord(invoice);
		if(value>0) {
			req.setAttribute("status", ri.readInvoiceRecord());
		}
		else {
			req.setAttribute("status",ri.readInvoiceRecord());
		}
		RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
    	rd.forward(req, res);
		
    	
    	//List<Invoice> invoicerec=ri.readInvoiceRecord();
    	
		
	}
	

		
	
}
