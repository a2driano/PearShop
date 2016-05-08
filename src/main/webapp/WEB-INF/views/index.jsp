<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PearShop</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap-theme.min.css"/>"/>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans&subset=latin,cyrillic' rel='stylesheet'
          type='text/css'>
    <script src="<c:url value="/resources/js/lib/jquery-2.1.4.min.js"/>"></script>
    <script src="<c:url value="/resources/js/lib/bootstrap.min.js"/>"></script>
    <link rel="shortcut icon" type="image/png" href="<c:url value="/resources/img/favicon.png"/>">
</head>
<body>
<div class="container header">
    <div class="logo">
        <a href="#">
            <img class="logo" src="/resources/img/logo.svg"/></a>
    </div>
</div>
<div class="container-fluid info">
    <div class="container">MENU</div>
</div>
<div class="container">
    <h1>${message}</h1>

    <div id="test">
        <c:forEach items="${productList}" var="productDTO">
            <tr>
                <td>${productDTO.id}</td>
                <br>
                <td>${productDTO.name}</td>
                <br>
                <td>${productDTO.category}</td>
                <br>
                <td>${productDTO.description}</td>
                <br>
            </tr>
        </c:forEach>
    </div>
</div>
</body>
</html>