<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 11/25/2016
  Time: 9:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Home</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/offers">Offers</a> <br>
<a href="${pageContext.request.contextPath}/createoffer">Create Offer</a>

<%--<a href="${pageContext.request.contextPath}/loggedout">Logout</a>--%>

<sec:authorize access="isAuthenticated()">
    <p><a href="<c:url value="/j_spring_security_logout"/>">Logout</a> </p>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
    <p><a href="<c:url value="/login"/>">Login</a> </p>
</sec:authorize>

<sec:authorize access="hasRole('ROLE_ADMIN')">

    <p><a href="${pageContext.request.contextPath}/admin">Admin page</a></p>

</sec:authorize>

</body>
</html>
