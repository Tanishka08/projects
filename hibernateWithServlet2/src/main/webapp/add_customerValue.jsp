<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Adding A Customer</title>
</head>
<body>

	<form id="form-1" action="CustomerController.do" method="post">

		<table class="table">

			<tbody>
				<tr>

					<td><label>First Name:</label></td>
					<td><input placeholder="FIRST NAME" type="text" name="fName"
						required="required" /></td>

				</tr>
				<tr>

					<td><label>Last Name:</label></td>
					<td><input placeholder="LAST NAME" type="text" name="lName"
						required="required" /></td>

				</tr>
				<tr>

					<td><label>email:</label></td>
					<td><input placeholder="EMAIL" type="email" name="email"
						required="required" /><br /></td>

				</tr>
			</tbody>
		</table>
		<input type="submit" value="ADD" id="button-1" />
		 <input type="reset"
			value="RESET" id="button-2" />
	</form>
</body>
</html>