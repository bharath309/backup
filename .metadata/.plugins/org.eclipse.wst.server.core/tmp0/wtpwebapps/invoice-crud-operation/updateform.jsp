<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bharath.invoice.crud.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"52011",secure:"52020"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-4" data-genuitec-path="/invoice-crud-operation/src/main/webapp/updateform.jsp">
	<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-4" data-genuitec-path="/invoice-crud-operation/src/main/webapp/updateform.jsp">
		<%
			String id = request.getParameter("id");
			Invoice inv = InvoiceCrudRepo.getRecordById(Integer.parseInt(id));
		%>
		<h1>Create Invoice</h1>
		<form action="up.do" method="post">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id" value="<%=inv.getId()%>"></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname"value="<%=inv.getFirstName()%>"></td>
				</tr>
				<tr>
					<td>Product Name:</td>
					<td><input type="text" name="pname"value="<%=inv.getProductName()%>"></td>
				</tr>
				<tr>
					<td>Product Cost:</td>
					<td><input type="number" step="any" name="cost"value="<%=inv.getProductCost()%>"></td>
				</tr>
				<tr>
					<td>Product Discount:</td>
					<td><input type="number" step="any" name="discount"value="<%=inv.getDiscount()%>"></td>
				</tr>
				<tr>
					<td>Payment Type:</td>
					<td><select name="dropdownlist" value="<%=inv.getTransactionType()%>">
							<option value="Card">Card</option>
							<option value="Cash">Cash</option>
							<option value="Check">Check</option>
					</select></td>
				</tr>
			</table>
			<br> Accept terms and Conditions <input type="checkbox"
				name="checkbox" value="<%=inv.getDecision()%>"> <br>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
		<br>
		<form action="show.do" method="post">
			<button type="submit" class="btn btn-info">All invoice List</button>

		</form>
	</div>
</body>
</html>