<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"52011",secure:"52020"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-3" data-genuitec-path="/invoice-crud-operation/src/main/webapp/result.jsp">
<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-3" data-genuitec-path="/invoice-crud-operation/src/main/webapp/result.jsp">

<input type="button" value="Add Student" 
				   onclick="window.location.href='index.jsp'; return false;"
				   class="add-student-button"
			/>
			<c:forEach var="x" begin="10" end="15">
			Item: <c:out value="${x}"/><p>
			
			</c:forEach>
<%
String message=request.getAttribute("status").toString();
out.println(message);
%>


</div>
</body>
</html>
