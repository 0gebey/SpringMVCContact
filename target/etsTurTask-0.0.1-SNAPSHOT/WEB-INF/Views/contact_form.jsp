<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Contact</title>
<%@ include file="./header.jsp"%>
</head>

<body>
    <div align="center">
        <h1>Add a New Contact</h1>
        <form:form action="save" method="post" modelAttribute="contact">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td><form:input path="surname" /></td>
            </tr>
			            <tr>
                <td>Blood:</td>
                <td><form:input path="blood" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input path="phone" /></td>
            </tr>
                        <tr>
                <td>Address:</td>
                <td><form:input path="adress" /></td>
            </tr>
            <tr>
                <td  colspan= "2" align= "center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
<%@ include file="./footer.jsp"%>
</html>