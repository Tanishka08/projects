<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processLogin" modelAttribute="student">
Email Address<form:input path="email"/>
Password<form:input path="password"/>
Java<form:radiobutton path="favLang" value="Java"/>
Python<form:radiobutton path="favLang" value="Python"/>
JavaScript<form:radiobutton path="favLang" value="JavaScript"/>
DotNet<form:radiobutton path="favLang" value="DotNet"/>
HTML<form:radiobutton path="favLang" value="HTML"/>
Windows<form:checkbox path="courses" value="Windows"/>
Android<form:checkbox path="courses" value="Android"/>
Linux<form:checkbox path="courses" value="Linux"/>

<input type="submit" value="login"/>
</form:form>
</body>
</html>