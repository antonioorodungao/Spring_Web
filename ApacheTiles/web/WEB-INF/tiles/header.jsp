<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
<a class="title" href="<c:url value="/"/>">Offers</a>
<sec:authorize access="isAuthenticated()">
    <p><a class="login" href="<c:url value="/j_spring_security_logout"/>">Logout</a> </p>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
    <p><a class="login" href="<c:url value="/login"/>">Login</a> </p>
</sec:authorize>
