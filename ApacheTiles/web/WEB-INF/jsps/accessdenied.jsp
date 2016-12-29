<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/24/2016
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Access Denied</title>
</head>
<body>

You are denied of an acess to the page.

<p>
<a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
</p>
<p>
<a href="/home">Home</a>
</p>
</body>
</html>
