<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Virtual Store</title>
</head>
<body>
<c:if test="${message !='Usuario'}">
    <h4>${message}</h4>
</c:if>
<spring:url var="checkLogin" value="/main.tek"/>
<form:form id="login" modelAttribute="users" method="POST" action="${checkLogin}">
    <table width="400px" height="150px">
        <tr>
            <td><form:label path="username">Usuario</form:label></td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Clave</form:label></td>
            <td><form:input path="password" type="password"/></td>
        </tr>
        <tr><td></td><td>
            <input type="submit" value="Ingresar" />
        </td></tr>
    </table>
</form:form>
</body>
</html>