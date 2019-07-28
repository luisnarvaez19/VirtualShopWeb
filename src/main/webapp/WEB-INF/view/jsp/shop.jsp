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
    <h4>${message} : ${user.username}</h4>
    <spring:url var="exit" value="/login.tek"/>
    <a href="${exit}" >Salir</a>
    <br><br>
    <c:choose>
        <c:when test="${empty listProducts}">
            <h4>¡No ha productos registrados!</h4>
        </c:when>
        <c:otherwise>
            <table border="1" bgcolor="black" width="600px">
                <tr style="background-color: teal;color: white;text-align: center;" height="40px">
                    <td>Descripción</td>
                    <td>Tipo</td>
                    <td>Tamaño</td>
                    <td>Color</td>
                    <td>Precio</td>
                    <td>Existencia</td>
                </tr>
                <c:forEach items="${listProducts}" var="product">
                    <tr style="background-color:white;color: black;text-align: center;" height="30px" >
                        <td><c:out value="${product.name}"/></td>
                        <td><c:out value="${product.type.name}"/></td>
                        <td><c:out value="${product.size}"/></td>
                        <td><c:out value="${product.color}"/></td>
                        <td><c:out value="${product.price}"/></td>
                        <td><c:out value="${product.existence}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>
</body>
</html>
