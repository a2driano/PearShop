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
    <div class="container">
        <div class="col-md-4 menu" index="IPHONE"><h2>- iPhone -</h2></div>
        <div class="col-md-4 menu" index="IPAD"><h2>- iPad -</h2></div>
        <div class="col-md-4 menu" index="IWATCH"><h2>- iWatch -</h2></div>
    </div>
</div>
<div class="container text-center">
    <h1 class="header-product">ПОПУЛЯРНЫЕ ТОВАРЫ</h1>
</div>
<div class="container productall">
    <c:forEach items="${productList}" var="productDTO">
        <div class="col-md-3 product" index=${productDTO.id} category=${productDTO.category}>
            <div class="row text-center"><img class="imagesmall" src="/resources/img/product/${productDTO.article}.jpg">
            </div>
            <h4 class="textinfo">${productDTO.name}</h4>

            <h3 class="text-right price">${productDTO.price}0 грн</h3>

            <div class="arrow">Подробнее...</div>
        </div>
    </c:forEach>
</div>
<div class="container order-form">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <form class="form-group-md">
            <fieldset class="row form-group order-row firstname-input">
                <label for="firstname">*Имя:</label>
                <input id="firstname" class="form-control" name="firstname" type="text" maxlength="25" size="40"
                       placeholder="Введите ваше имя"></fieldset>
            <fieldset class="row form-group order-row">
                <label for="lastname">Фамилия:</label>
                <input id="lastname" class="form-control" name="lastname" type="email" maxlength="25" size="40"
                       placeholder="Введите вашу фамилию"></fieldset>
            <fieldset class="row form-group order-row email-input">
                <label for="email">Е-mail:</label>
                <input id="email" class="form-control" name="email" type="email" maxlength="25" size="50"
                       placeholder="e-mail">
            </fieldset>
            <fieldset class="row form-group order-row phone-input">
                <label for="phone">*Телефон (в формате '380007778899'):</label>
                <input id="phone" class="form-control" name="phone" type="text" maxlength="12" size="40"
                       placeholder="введите контактный номер телефона"></fieldset>
            <fieldset class="row form-group order-row">
                <label for="description">Дополнительная информация:</label>
                <textarea id="description" class="form-control" rows="10" cols="39" name="description"
                          maxlength="500"></textarea>

                <p>*-поля обязательные для заполнения</p>
            </fieldset>
            <div class="row text-center order-row">
                <div id="send" class="btn btn-success btn-lg button-order">КУПИТЬ</div>
            </div>
        </form>
    </div>
    <div class="col-lg-4"></div>
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
</body>
</html>