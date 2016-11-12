<%--
  Created by IntelliJ IDEA.
  User: Oro
  Date: 10/12/2016
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Home JSP</title>
</head>
<body>
Hi there!

Session:   <%= session.getAttribute("name")%>  <p/>

Request:   <%= request.getAttribute("name")%> <p/>

Request: (Using EL): ${name} <p/>

<%--JSTL--%>
<c:out value="${name}"/> <p/>


</body>
</html>
