<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css"
		  rel="stylesheet"
		  href="style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="add-customer-style.css">
</head>
<title>Save Customers</title>
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>Tanishka HomePage- Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
		<form action="controller.do" method="POST">
		
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="fName" required="required" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><input type="text" name="lName" required="required"/></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><input type="email" name="email" required="required"/></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="homecontroller.do">Back to List</a>
		</p>
	
	</div>
</body>
</html>