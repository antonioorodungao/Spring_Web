<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/29/2016
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
    <title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
</head>
<body>
<div class="header"><tiles:insertAttribute name="header"></tiles:insertAttribute> </div>
<hr>
<div class="content"><tiles:insertAttribute name="content"></tiles:insertAttribute> </div>
<hr>
<div><tiles:insertAttribute name="footer"></tiles:insertAttribute> </div>



</body>
</html>
