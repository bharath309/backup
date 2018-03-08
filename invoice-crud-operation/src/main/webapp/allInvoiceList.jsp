<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ page import="java.util.*,com.bharath.invoice.crud.*"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<!-- put new button: Add Student -->
			
			<input type="button" value="Add Student" 
				   onclick="window.location.href='index.jsp'; return false;"
				   class="add-student-button"
			/>
			<%-- <c:forEach var="x" begin="10" end="15">
			Item: <c:out value="${x}"/><p>
			
			</c:forEach>
			<c:set var="text" value="I'am learning Jstl"></c:set>
			<c:if test="${fn:contains(text,sleep) }">
			<c:out value="I am not on track"></c:out>
			</c:if> --%>
				
		 <%
			String message = request.getAttribute("sqltable").toString();
			out.println(message);
		%> 
		
	</div>
</body>
</html>