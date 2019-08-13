// Animate social media icons with hover.
$(document).ready(function () {
    $(".crcontentimg").hover(function () {
        $(this).addClass("scaleit");
    }, function () {
        $(this).removeClass("scaleit");
    });
});
// Load and display Github repos.
$(document).ready(function (){
    loadRepos();
});

function loadRepos() {
    $("#repos").empty();

    let url = "https://api.github.com/users/davidaturner/repos";
    $.ajax({
        url,
        success: displayRepos,
        error: displayError
    });

    function displayRepos(respos) {
        for (let repo of respos) {
            let link = $('<a>').text(repo.full_name);
            link.attr('href', repo.html_url);
            $("#repos").append($('<li>').append(link));
        }
    }
    function displayError(err) {
        $("#repos").append($("<li>Error</li>"));
    }
}

