<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/23/2016
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"> </link>
    <title>Admin Page</title>
</head>
<body>
Admin page


<table class="formtable">
    <tr>
        <td class="header">Username</td><td class="header">Email</td><td class="header">Role</td><td class="header">Enabled</td>
    </tr>

    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.username}</td><td>${user.email}</td><td>${user.authority}</td><td>${user.enabled}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
