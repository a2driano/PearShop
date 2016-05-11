/**
 * Created by Администратор on 09.05.2016.
 */
$(document).ready(function () {
    onStart();
});
var onStart = function () {
    /**select product category*/
    $('.menu').on('click', function () {
        var data = {
            category: $(this).attr('index')
        };
        var category = $(this).attr('index');
        console.log(data);
        $.ajax({
            url: $hostRoot + category,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                $('.header-product').html('<h1 class="header-product">' + category + '</h1>');
                $('.productall').hide(100);
                $('.productall').html('');
                $('.productall').show(400);
                for (var i = 0; i < data.length; i++) {
                    var type = data[i];
                    $('.productall').append('<div class="col-md-3 product" index="' + type.id + '"} categoty="' + type.category + '">' +
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
