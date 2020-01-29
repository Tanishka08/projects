<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.myCompany.Customer" %>
    <%@page import="java.util.List" %>
    <%@page import="com.myCompany.CustomerServiceImpl" %>
    <%@page import="com.myCompany.CustomerService" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers Here!</title>
</head>

<link type="text/css"
		  rel="stylesheet"
		  href="style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>HomePage -Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add A Customer"
				   onclick="window.location.href='customer-form.jsp'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	



</body>
</html>