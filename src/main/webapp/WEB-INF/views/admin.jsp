<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PearShop</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/admin.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap-theme.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/FontAwesome/font-awesome.css"/>"/>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans&subset=latin,cyrillic' rel='stylesheet'
          type='text/css'>
    <script src="<c:url value="/resources/js/lib/jquery-2.1.4.min.js"/>"></script>
    <script src="<c:url value="/resources/js/onstart.js"/>"></script>
    <script src="<c:url value="/resources/js/lib/bootstrap.min.js"/>"></script>

    <script type="text/javascript">
        var $applicationRoot = '/';
        var $host = document.location.protocol + '//' + document.location.host;
        var $hostRoot = document.location.protocol + '//' + document.location.host + $applicationRoot;
    </script>
    <link rel="shortcut icon" type="image/png" href="<c:url value="/resources/img/favicon.png"/>">
</head>
<body>
<div class="container header">
    <div class="col-md-6"><a href="/"><img class="logo" src="/resources/img/logo.svg"/></a></div>
    <div class="col-md-6"><h3 class="phone">0 800 503 808<br>0 800 503 777</h3></div>
</div>
<div class="container-fluid info">

</div>
<div class="container text-center">
    <h1 class="header-product">ЗАКАЗЫ</h1>
</div>
<div class="container">
    <div class="col-lg-12">
        <table id="order_table" class="table table-bordered table-condensed table-hover">
            <thead>
            <tr class="head_table">
                <td>№</td>
                <td>Товар</td>
                <td>К оплате</td>
                <td>Заказчик</td>
                <td>E-mail</td>
                <td>Телефон</td>
                <td>Дата</td>
                <td>Заметка к заказу</td>
                <td>Статус</td>
                <td>Действие</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${countProductList}" var="countProductList">
                <tr class="body_table">
                    <td index="${countProductList.id}" id="index-order">${countProductList.userOrder.id}</td>
                    <td index="${countProductList.product.id}">
                        <p><b>${countProductList.product.name}</b></p>
                        <p>Стоимость: ${countProductList.product.price}0 грн</p>
                        <p>Количество: ${countProductList.count} шт</p></td>
                    <td>${countProductList.sumCount}0 грн</td>
                    <td>${countProductList.userOrder.firstname}<br>${countProductList.userOrder.lastname}</td>
                    <td>${countProductList.userOrder.email}</td>
                    <td>${countProductList.userOrder.phone}</td>
                    <td>${countProductList.userOrder.date}</td>
                    <td>${countProductList.userOrder.description}</td>
                    <td id="status-order" class="alert-danger text-center">${countProductList.userOrder.status}
                    <button class="btn btn-success btn-sm center-block change-status">Изменить</button></td>
                    <td class="button-container"><button class="btn btn-success btn-sm center-block save-status" disabled="disabled" index="${countProductList.userOrder.id}">Сохранить</button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="center-block container">
        <a href="/logout">
            <button class="btn btn-success btn-lg">Выйти</button>
        </a>
    </div>
</div>

<div class="container-fluid footer">
    <div class="container">
        <div class="col-md-4">
            <h3>©PearShop
                <br><h6>ТМ используется на основании лицензии правообладателя</h6></h3>
        </div>
        <div class="col-md-4"><h6>Выставочный зал:<br>г. Днепропетровск, ул. Калиновая, 57<br><br>
            Сервисный отдел:<br>г. Днепропетровск, ул. Староказацкая, 46а
        </h6></div>
        <div class="col-md-4"><h4>0 800 503 808<br>0 800 503 777</h4>
            <h6>Магазин разработан и поддерживается a2driano©</h6></div>
    </div>
</div>
<div class="modal" id="modal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h2>Заказ</h2>
            </div>
            <div class="modal-body">

            </div>
            <div class="modal-footer">

            </div>
        </div>
    </div>
</div>
</body>
</html>