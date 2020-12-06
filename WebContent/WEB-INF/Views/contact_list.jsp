<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact Manager Home</title>
<%@ include file="./header.jsp"%>
</head>

<body>
<div class="grid-container" align="center">
	<div  >
		<h1>Contact List</h1>

		<table border="1">
			<th>No</th>
			<th>Name</th>
			<th>Surname</th>
			<th>Blood</th>
			<th>Telephone</th>
			<th>Address</th>

			<c:forEach var="contact" items="${listContact}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${contact.name}</td>
					<td>${contact.surname}</td>
					<td>${contact.blood}</td>
					<td>${contact.phone}</td>
					<td>${contact.adress}</td>
				</tr>
			</c:forEach>
		</table>
				<h3>
			<a href="new">New Contact</a>
		</h3>
	</div>
	</div>
</body>
<%@ include file="./footer.jsp"%>
</html>