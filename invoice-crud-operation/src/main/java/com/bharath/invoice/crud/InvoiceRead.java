package com.bharath.invoice.crud;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvoiceRead
 */
public class InvoiceRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReadInvoice ri=new ReadInvoice();

    	req.setAttribute("sqltable",ri.readInvoiceRecord());
		RequestDispatcher rd1=req.getRequestDispatcher("allInvoiceList.jsp");
		rd1.forward(req, res);
		doGet(req, res);
	}

}
