<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form:form action="rgurl" method="post" modelAttribute="per">
			<form:label path="pid">Enter Pid:</form:label>
			<form:input path="pid" />
			<br>
			<br>
			<form:label path="pname">Enter PersonName:</form:label>
			<form:input path="pname" />
			<br>
			<br>
			<form:label path="mobilenumber">Enter MobileNumber</form:label>
			<form:input path="mobilenumber" />
			<br>
			<br>
			<input type="submit" value="Register" />
		</form:form>
	</center>
</body>
</html>