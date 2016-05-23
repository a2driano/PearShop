/**
 * Created by Администратор on 09.05.2016.
 */
$(document).ready(function () {
    onStart();
    clickPrice();
    $('.order-form').hide();
});
var priceProduct;
var onStart = function () {
    /**select category*/
    $('.menu').on('click', function () {
        var category = $(this).attr('index');
        $('.form-control').val('');
        $('.order-form').hide();
        $.ajax({
            url: $hostRoot + category,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                $('.header-product').show();
                $('.header-product').html('<h1 class="header-product">' + category + '</h1>');
                $('.productall').hide(100);
                $('.productall').html('');
                $('.productall').show(400);
                for (var i = 0; i < data.length; i++) {
                    var type = data[i];
                    $('.productall').append('<div class="col-md-3 product" index="' + type.id + '" category="' + type.category + '">' +
                        '<div class="row text-center"><img class="imagesmall" src="/resources/img/product/' + type.article + '.jpg"></div>' +
                        '<h4 class="textinfo">' + type.name + '</h4>' +
                        '<h3 class="text-right price">' + type.price + '.00 грн</h3>' +
                        '<div class="arrow">Подробнее...</div></div>');
                }
            },
            error: function (error) {
                console.log('ERROR')
                console.log(error)
            }
        });
    });

    /**select product*/
    $('.productall').on('click', '.product', function () {
        $('.order-form').hide();
        $('.form-control').val('');
        var data = {
            category: $(this).attr('category'),
            id: $(this).attr('index')
        };
        $.ajax({
            url: $hostRoot + data.category + '/' + data.id,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                priceProduct = data.price;
                $('.header-product').hide();
                $('.productall').hide(100);
                $('.productall').html('');
                $('.productall').show(400);
                $('.productall').append("<script>$(function(){$('.spinner .btn:first-of-type').on('click', function() {var btn = $(this);var input = btn.closest('.spinner').find('input');if (input.attr('max') == undefined || parseInt(input.val()) < parseInt(input.attr('max'))) {input.val(parseInt(input.val(), 10) + 1);$('#price-display').text(priceProduct*parseInt(input.val())+'.00 грн');} else {btn.next('disabled', true);}});$('.spinner .btn:last-of-type').on('click', function() {" +
                    "var btn = $(this); var input = btn.closest('.spinner').find('input'); if (input.attr('min') == undefined || parseInt(input.val()) > parseInt(input.attr('min'))) {input.val(parseInt(input.val(), 10) - 1);$('#price-display').text(priceProduct*parseInt(input.val())+'.00 грн'); } else { btn.prev('disabled', true); }});})</script>" +
                    '<div class="container current" index=' + data.id + ' category=' + data.category + '">' +
                    '<div class="col-lg-4 imagebig"><img class="big" src="/resources/img/product/' + data.article + '.jpg"></div>' +
                    '<div class="col-lg-8 infocurrent"><div class="row"><h1>' + data.name + '</h1><p>Артикул: ' + data.article + '</p>' +
                    '</div><div class="row"><p>' + data.description + '</p><p>На товар предоставляется гарантия 12 месяцев</p></div>' +
                    '<div class="row spinrow"><p>Количество:<br></p><div class="input-group spinner col-lg-1" ><input id="count_product" type="text" class="form-control" value="1" min="1" max="30" ><div class="input-group-btn-vertical">' +
                    '<button class="btn btn-success" type="button""><i class="fa fa-caret-up"></i></button><button class="btn btn-success" type="button" ><i class="fa fa-caret-down"></i></button></div></div></div>' +
                    '<div class="row"><div id="price-display" class="price-product">' + data.price + '.00 грн</div>' +
                    '<button id="checkout" class="btn btn-success btn-lg button-price" onclick="clickPrice()">ОФОРМИТЬ ЗАКАЗ</bu></div></div></div>');
            },
            error: function (error) {
                console.log('ERROR'),
                    console.log(data),
                    console.log(error)
            }
        });
    });

    /**add order*/
    $('.order-form').on('click', '#send', function () {
        var data = {
            firstname: $('#firstname').val(),
            lastname: $('#lastname').val(),
            email: $('#email').val(),
            phone: $('#phone').val(),
            description: $('#description').val(),
            date: new Date(),
            status: 'ACTIVE',
            id_product: $('.current').attr('index'),
            count: $('#count_product').val()

        };
        console.log(data);
        $.ajax({
            url: $hostRoot + 'addOrder',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function (response) {
                $('.error').hide();
                if (response.status == "SUCCESS") {
                    $('.order-form').html('');
                    $('.order-form').append('<h3 class="center-block order-success">Заказ получен, менеджер свяжется с Вами в ближайшее время!</h3>');
                } else {
                    console.log(response);
                    errorInfo = "";
                    for (i = 0; i < response.result.length; i++) {
                        $('.' + response.result[i].field + '-input').append('<p class="error">' + response.result[i].defaultMessage + '</p>');
                    }
                    console.log('ERRORING');
                }
            },
            error: function (error) {
                console.log('ERROR:' + error);
            }
        });
    });

    /**add selector of status*/
    $('.change-status').click(function () {
        $(this).hide();
        $(this).parent().append('<td id="status-order-select" class="alert-danger center-block"><select id="select-status" class="form-control">' +
            '<option value="ACTIVE">ACTIVE</option><option value="COMPLETED">COMPLETED</option><option value="CANCELED">CANCELED</option></select></td>');
        $(this).parent().next('.button-container').children('.save-status').removeAttr("disabled");
    });

    /**save status*/
    $('.save-status').on('click', function () {
        var data = {
            id: $(this).attr('index'),
            status: $('#select-status :selected').val()
        };
        console.log(data);
        $.ajax({
            url: $hostRoot + 'admin/update',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function (response) {
                console.log('Update success');
                location.href = $hostRoot + "admin";
            },
            error: function (error) {
                console.log('ERROR:' + error);
            }
        });
    });
};

/**order write*/
function clickPrice() {
    $('.button-price').hide(300);
    $('.order-form').show(200);
    $('.productall').append('');
};




