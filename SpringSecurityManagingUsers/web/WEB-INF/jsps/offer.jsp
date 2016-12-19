<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/18/2016
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <a href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
    <title>Offer</title>
</head>
<body>

<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Text</td>
    </tr>
    <tr>
        <td>${offer.id}</td>
        <td>${offer.name}</td>
        <td>${offer.email}</td>
        <td>${offer.text}</td>
    </tr>
</table>

<a href="${pageContext.request.contextPath}/offers">Back to Offers list.</a>

</body>
</html>
