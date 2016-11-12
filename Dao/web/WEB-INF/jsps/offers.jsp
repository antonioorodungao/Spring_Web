<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 11/4/2016
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/css/main.css" type="text/css" rel="stylesheet" />
    <title>Current Offers</title>

</head>
<body>
<table class="offers">
    <tr><td>ID</td><td>Name</td><td>Email</td><td>Text</td></tr>
    <c:forEach var="offer" items="${offers}">
        <tr><td>${offer.id}</td><td>${offer.name}</td><td>${offer.email}</td><td>${offer.text}</td></tr>
    </c:forEach>
</table>
</body>
</html>
