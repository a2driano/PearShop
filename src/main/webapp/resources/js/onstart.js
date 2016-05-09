/**
 * Created by Администратор on 09.05.2016.
 */
$(document).ready(function () {
    onStart();
});
var onStart = function () {
    $.ajax({
        url: $hostRoot,
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {
            $('.whirly-loader').hide();
            console.log(data);

            for(var i=0;i<data.length;i++){
                var type = data[i];
                $('.productall').append('<div class="col-md-3 product"><div class="row text-center"><img class="imagesmall" src="/resources/img/1.jpg"></div>+'+
                    +'<h4 class="textinfo">'+type.name+'</h4>'+
                    +'<h3 class="text-right price">'+type.price+' грн.</h3><div class="arrow">Подробнее...</div></div>');
            }


            //var type = data[i].toLowerCase();
            //$('#forDishes').append('<div class="blackRectangle"><div id="' + type + '"></div><div class="infoText">' + type.toUpperCase() + '</div></div>');


            //<div class="col-md-3 product"><div class="row text-center"><img class="imagesmall" src="/resources/img/1.jpg"></div>
            //    <h4 class="textinfo">iPad Air 2 Wi-Fi + LTE 16GB Space Gray</h4>
            //<h3 class="text-right price">11000 грн.</h3><div class="arrow">Подробнее...</div></div>
        },
        error: function (error) {
            console.log('ERROR')
            console.log(error)
        }
    });
};
