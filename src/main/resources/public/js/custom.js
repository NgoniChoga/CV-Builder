$(document).ready(function () {
    console.log("ready");
    $('.sidebar a').click(function () {
        //removing the previous selected menu state
        console.log("remove");
        $('.sidebar').find('li.current').removeClass('current');
        //adding the state for this parent menu
        console.log("Added")
        $(this).parents("li").addClass('current');

    });
});