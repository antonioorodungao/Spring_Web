<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/19/2016
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head><title>Login Page</title>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>

</head>
<body onload='document.f.j_username.focus();'>
<h3>Login with Username and Password</h3>
<c:if test="${param.error != null}">
    <p class="error">Incorrect username and password.</p>
</c:if>
<form name='f' action='${pageContext.request.contextPath}/j_spring_security_check' method='POST'>
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='j_username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='j_password'/></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="Login"/></td>
        </tr>
    </table>
</form>
</body>
</html>