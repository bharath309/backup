<html>
<body>
<h1>Create Invoice</h1>
<form action="un.do" method="post">

First Name: 	<input type="text" name="fname"><br>
Product Name: 	<input type="text" name="fname"><br>
Product Cost:	<input type="number" step="any" name="cost"><br>
Product Discount:<input type="number" step="any" name="discount"><br>
Payment Type:
<select>
  <option value="Card">Card</option>
  <option value="Cash">Cash</option>
  <option value="Check">Check</option>
</select><br>
Accept terms and Conditions<input type="checkbox">
<button type="submit">Submit</button>
</form>
<form action="un.do" method="get">
<button type="submit"> All invoice List</button>
</form>
</body>
</html>
