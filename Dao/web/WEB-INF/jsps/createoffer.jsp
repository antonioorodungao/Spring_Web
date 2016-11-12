<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 11/10/2016
  Time: 10:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
    <title>Create Offer</title>
</head>
<body>
<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">
    <table class="formtable">
        <tr>
            <td> Name:</td><td><sf:input path="name" name="name" type="text"/> <sf:errors cssClass="error" path="name"></sf:errors> </td>
        </tr>
        <tr>
            <td> Email</td><td><sf:input path="email" name="email" type="text"/> <sf:errors cssClass="error" path="email"></sf:errors> </td>
        </tr>
        <tr>
            <td> Your offer:</td><td><sf:textarea path="text" name="text" rows="10" cols="10" type="text"></sf:textarea> <sf:errors cssClass="error" path="text"></sf:errors> </td>
        </tr>

        <tr>
            <td></td><td><input class="control" value="Create Advert" type="submit"></td>
        </tr>
    </table>
</sf:form>
</body>
</html>
