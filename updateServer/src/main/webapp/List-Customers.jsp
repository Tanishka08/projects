<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>List Customers</title>

link type="text/css"
		  rel="stylesheet"
		  href="style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add customer"
				   onclick="window.location.href='customer-form.jsp'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
					<c:url var="updateUrl" value="updateCustomer.do">
					
					<c:param name="customerId" value="${tempCustomer.id}"/>
					</c:url>
					<c:url var="deleteUrl" value="deleteCustomer.do">
					
					<c:param name="customerId" value="${tempCustomer.id}"/>
					</c:url>			
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td><a href="${ updateUrl}">Update</a>/<a href="${ deleteUrl}">Delete</a></td>
						
					</tr>
				
				</c:forEach>
					
			</table>
			
		</div>
	
	</div>
</body>
</html>