<%--
  Created by IntelliJ IDEA.
  User: Oro
  Date: 10/12/2016
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Home JSP</title>
</head>
<body>
Hi there!
<p/>

<a href="${pageContext.request.contextPath}/offers">Offers</a> <p/>
<a href="${pageContext.request.contextPath}/createoffer">Create Offer</a> <p/>

<%--Session:   <%= session.getAttribute("name")%>  <p/>--%>

<%--Request:   <%= request.getAttribute("name")%> <p/>--%>

<%--Request: (Using EL): ${name} <p/>--%>

<%--&lt;%&ndash;JSTL&ndash;%&gt;--%>
<%--<c:out value="${name}"/> <p/>--%>




</body>
</html>
