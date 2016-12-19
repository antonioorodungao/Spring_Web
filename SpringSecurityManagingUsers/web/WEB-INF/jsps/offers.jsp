<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/5/2016
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/css/main.css" type="text/css" rel="stylesheet"/>
    <title>Offers</title>
</head>
<body>

<table class="offers">
    <tr><td>id</td><td>Name</td><td>Email</td><td>Text</td></tr>
    <c:forEach var="offer" items="${offers}">
        <tr>
            <td>"${offer.id}"</td>
            <td>"${offer.name}</td>
            <td>"${offer.email}</td>
            <td>"${offer.text}</td>
        </tr>
    </c:forEach>
</table>

<form name="getID" method="get" action="${pageContext.request.contextPath}/offer">
    Enter ID: <input type="text" name="id"/>
    <input type="submit" name="submit" value="Submit">
</form>



</body>
</html>
