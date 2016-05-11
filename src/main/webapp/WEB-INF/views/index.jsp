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
    <%--<div class="col-md-3 product">--%>
    <%--<div class="row text-center"><img class="imagesmall" src="/resources/img/1.jpg"></div>--%>
    <%--<h4 class="textinfo">iPad Air 2 Wi-Fi + LTE 16GB Space Gray</h4>--%>

    <%--<h3 class="text-right price">11000 грн.</h3>--%>

    <%--<div class="arrow">Подробнее...</div>--%>
    <%--</div>--%>
</div>
<%--<div class="container current index='' category=''">--%>
    <%--<div class="col-lg-4 imagebig">--%>
        <%--<img class="big" src="/resources/img/product/100001.jpg">--%>
    <%--</div>--%>
    <%--<div class="col-lg-8 infocurrent">--%>
        <%--<div class="row">--%>
            <%--<h1>Планшет iPad Air 2 Wi-Fi + LTE 16GB Space Gray</h1>--%>
            <%--<p>Артикул: 100001</p>--%>
        <%--</div>--%>
        <%--&lt;%&ndash;<div class="row"></div>&ndash;%&gt;--%>
        <%--<div class="row">--%>
            <%--<p>Экран 9.7" Retina (2048 x 1536 точек) с IPS-матрицей/ 16 млн. цветов / Apple A8X / камера 8 Мп + фронтальная 1.2 Мп / Bluetooth 4.0 / Wi-Fi 802.11 a/b/g/n/ac / 64 ГБ встроенной памяти / iOS 8.1 / 240 x 169.5 x 6.1 мм, 437 г / серебристый</p>--%>
            <%--<p>На товар предоставляется гарантия 12 месяцев</p>--%>
        <%--</div>--%>
        <%--<div class="row">--%>
            <%--<div class="price-product">11000 грн.</div>--%>
            <%--<div class="btn btn-success btn-lg button-price">КУПИТЬ</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
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