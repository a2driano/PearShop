<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PearShop</title>
</head>
<body>
    <h1>${message}</h1>
    <c:forEach items="${productList2}" var="productDTO">
        <tr>
            <td>${productDTO.id}</td><br>
            <td>${productDTO.name}</td><br>
            <td>${productDTO.category}</td><br>
            <td>${productDTO.description}</td><br>
        </tr>
    </c:forEach>
</body>
</html>