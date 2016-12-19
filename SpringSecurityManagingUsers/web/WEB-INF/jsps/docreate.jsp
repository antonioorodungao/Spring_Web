<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/5/2016
  Time: 11:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <a href="${pageContext.request.contextPath}/static/css/main.css" type="text/css" rel="stylesheet"></a>
    <title>Offer Created</title>
</head>
<body>
<p>Offer Successfully Created!</p>
<table class="formtable">
<tr>
    <td>Name</td>
    <td>${offer.name}</td>
</tr>
    <tr>
        <td>Email</td>
        <td>${offer.email}</td>

    </tr>
    <tr>
        <td>Text</td>
        <td>${offer.text}</td>
    </tr>
</table>

<a href="/offers">Click here for offers</a>
</body>
</html>
