<%@page import="hibernateWithServlet2.CustomerDto"%>
<%@page import="hibernateWithServlet2.CustomerMapper"%>
<%@page import="hibernateWithServlet2.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Second Page</title>
</head>
<body>
<body>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">UID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
<%
List<Customer> list=(List<Customer>)request.getAttribute("SUCCESS");
CustomerMapper impl=new CustomerMapper();
for(Customer c:list)
{
CustomerDto dto=impl.customerToCustomerDto(c);%>


	<tbody>
    <tr>
      <td><%out.println(dto.getUId()); %></td>
      <td><%out.println(dto.getFirstName()); %></td>
      <td><%out.println(dto.getLastName()); %></td>
      <td><%out.println(dto.getEmail()); %></td>
    </tr>
 
  </tbody>
<%}
%>
</table>
</body>
</html>