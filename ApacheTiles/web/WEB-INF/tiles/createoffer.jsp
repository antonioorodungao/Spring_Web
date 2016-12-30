<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 11/26/2016
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>

<!-- form method is important in post -->
<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">
    <table class="formtable">
        <tr>
            <td>Name</td>
            <td><sf:input path="name" name="name" type="text"></sf:input>
                <sf:errors cssClass="error" path="name"/></td>

        </tr>
        <tr>
            <td>Email</td>
            <td><sf:input path="email" name="email" type="text"></sf:input>
            <sf:errors path="email" cssClass="error"/> </td>
        </tr>

        <tr>
            <td>Text</td>
            <td><sf:textarea path="text" name="text" rows="10" cols="10" type="text"></sf:textarea>
                <sf:errors path="text" cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input class="control" value="Create Advert" type="submit"/></td>
        </tr>
    </table>
</sf:form>