<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact Manager Home</title>
<%@ include file="./WEB-INF/Views/header.jsp"%>
</head>

<body>
<div class="grid-container" align="center">
	<div  >
		<h1><bold>Welcome to the home page..</bold></h1>
		<h2>Please choose a direction below</h2>
		
		<a href="list">Contact List</a>
		<li>------------------------------------</li>
		<a href="new">New Contact</a>


	</div>
</body>
<%@ include file="./WEB-INF/Views/footer.jsp"%>
</html>