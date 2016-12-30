<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"> </link>

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
