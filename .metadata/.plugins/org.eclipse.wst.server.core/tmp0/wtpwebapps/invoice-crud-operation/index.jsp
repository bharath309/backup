<html>
<head>
<title>Invoice</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"52011",secure:"52020"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-2" data-genuitec-path="/invoice-crud-operation/src/main/webapp/index.jsp">
	<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-2" data-genuitec-path="/invoice-crud-operation/src/main/webapp/index.jsp">
		<h1>Create Invoice</h1>

		<form action="un.do" method="post">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>Product Name:</td>
					<td><input type="text" name="pname"></td>
				</tr>
				<tr>
					<td>Product Cost:</td>
					<td><input type="number" step="any" name="cost"></td>
				</tr>
				<tr>
					<td>Product Discount:</td>
					<td><input type="number" step="any" name="discount"></td>
				</tr>
				<tr>
					<td>Payment Type:</td>
					<td><select name="dropdownlist">
							<option value="Card">Card</option>
							<option value="Cash">Cash</option>
							<option value="Check">Check</option>
					</select></td>
				</tr>
			</table>
			<br> Accept terms and Conditions <input type="checkbox"
				name="checkbox" value="yes"> <br>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
		<br>
		<form action="show.do" method="post">
			<button type="submit" class="btn btn-info">All invoice List</button>

		</form>
	</div>
</body>
</html>
