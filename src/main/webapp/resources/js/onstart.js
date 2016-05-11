/**
 * Created by Администратор on 09.05.2016.
 */
$(document).ready(function () {
    onStart();
});
var onStart = function () {
    /**select category*/
    $('.menu').on('click', function () {
        var category = $(this).attr('index');
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
        var data = {
            category: $(this).attr('category'),
            id: $(this).attr('index')
        };
        console.log(data);
        $.ajax({
            url: $hostRoot + data.category + '/' + data.id,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                $('.header-product').hide();
                $('.productall').hide(100);
                $('.productall').html('');
                $('.productall').show(400);
                $('.productall').append('<div class="container current index=' + data.id + ' category=' + data.category + '">'+
                '<div class="col-lg-4 imagebig"><img class="big" src="/resources/img/product/' + data.article + '.jpg"></div>' +
                '<div class="col-lg-8 infocurrent"><div class="row"><h1>' + data.name + '</h1><p>Артикул: ' + data.article + '</p>' +
                '</div><div class="row"><p>' + data.description + '</p><p>На товар предоставляется гарантия 12 месяцев</p></div>' +
                '<div class="row"><div class="price-product">' + data.price + '.00 грн</div>' +
                '<div class="btn btn-success btn-lg button-price">КУПИТЬ</div></div></div></div>');
            },
            error: function (error) {
                console.log('ERROR'),
                console.log(data),
                console.log(error)
            }
        });
    });

    //$.ajax({
    //    url: $hostRoot,
    //    type: 'get',
    //    dataType: 'json',
    //    contentType: 'application/json',
    //    success: function (data) {
    //        $('.whirly-loader').hide();
    //        console.log(data);
    //
    //        for(var i=0;i<data.length;i++){
    //            var type = data[i];
    //            $('.productall').append('<div class="col-md-3 product"><div class="row text-center"><img class="imagesmall" src="/resources/img/1.jpg"></div>+'+
    //                +'<h4 class="textinfo">'+type.name+'</h4>'+
    //                +'<h3 class="text-right price">'+type.price+' грн.</h3><div class="arrow">Подробнее...</div></div>');
    //        }
    //    },
    //    error: function (error) {
    //        console.log('ERROR')
    //        console.log(error)
    //    }
    //});
};
