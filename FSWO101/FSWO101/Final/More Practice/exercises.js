$(document).ready(function () {
    $("p").hover(function () {
        $(this).css("background-color", "yellow");
    }, function () {
        $(this).css("background-color", "pink");
    });
});

$(document).ready(function () {
    $(".animateit").hover(function () {
        $(this).addClass("scaleit");
    }, function () {
        $(this).removeClass("scaleit");
    });
});
