<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 11/26/2016
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/script/jquery.js"
        rel="script"></script>

<script type="text/javascript">
    function onLoad() {
        $("#passwd").on("keypress", checkPasswordsMatch());
        $("#confirmpass").on("keypress", checkPasswordsMatch());
    }

    function checkPasswordsMatch() {
        var password = $("#passwd").val();
        var confirmpass = $("#confirmpass").val();
        if (password.length > 3 || confirmpass.length > 3) {

            if (password == confirmpass) {
                $("#matchpassword").text("<fmt:message key='password.match'/>");
            } else {
                $("#matchpassword").text("<fmt:message key='password.mismatch'/>");
            }
        }
    }

    $(document).ready(onLoad);
</script>


<!-- form method is important in post -->
<sf:form method="post" action="${pageContext.request.contextPath}/accountcreated" commandName="user">
    <table class="formtable">
        <tr>
            <td>Username</td>
            <td><sf:input class="control" path="username" name="username" type="text"></sf:input>
                <sf:errors cssClass="error" path="username"/></td>

        </tr>
        <tr>
            <td>Email</td>
            <td><sf:input class="control" path="email" name="email" type="text"></sf:input>
                <sf:errors path="email" cssClass="error"/></td>
        </tr>

        <tr>
            <td>Password</td>
            <td><sf:input class="control" id="passwd" path="password" name="password" rows="10" cols="10"
                          type="password"></sf:input>
                <sf:errors path="password" cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td>Confirm Password</td>
            <td><input class="control" id="confirmpass" name="confirmpass" type="password">
                <div id="matchpassword"></div>
                </input>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input class="control" value="Create Account" type="submit"/></td>
        </tr>
    </table>
</sf:form>
