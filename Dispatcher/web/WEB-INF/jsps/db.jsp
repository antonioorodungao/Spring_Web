<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 11/4/2016
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:query var="rs" dataSource="jdbc/myoracle">
    select id, name from offers
</sql:query>

<html>
<head>
    <title>JNDI Database Testing</title>
</head>
<body>

Database name: <c:out value="${dbname}" />

<p/>

<c:forEach var="row" items="${rs.rows}">
    id:  ${row.id}
    name: ${row.name} <br/>
</c:forEach>

</body>
</html>
