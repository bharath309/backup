package com.bharath.invoice.crud;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvoiceUpdateServlet
 */
public class InvoiceUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
		
		Invoice invoice=new Invoice(id, firstName, productName, productCost, discount, transactionType, decision);
		UpdateInvoiceRecord upi=new UpdateInvoiceRecord();
		ReadInvoice ri=new ReadInvoice();
		int value=0;
		upi.updateInvoiceRecord(invoice);
		if(value>0) {
			req.setAttribute("status", ri.readInvoiceRecord());
		}
		else {
			req.setAttribute("status",ri.readInvoiceRecord());
		}
		RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
    	rd.forward(req, res);
		doGet(req, res);
	}

}
