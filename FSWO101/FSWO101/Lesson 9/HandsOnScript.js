function helloWorld() {
    console.log("Hello Again from JS");
}
function getAlbert() {
    let newRequest = new XMLHttpRequest();
    newRequest.onreadystatechange = function () {
        if (this.readyState === 4 && this.status === 200) {
            let myObj = JSON.parse(this.responseText);

            // Load to DOM object.
            document.getElementById("albert").innerHTML =
                myObj.firstname + " " +
                myObj.lastname + " (born: " +
                myObj.birthday + ") ";
            document.getElementById("albertbio").innerHTML =
                myObj.bio;
        }
    };
    newRequest.open("GET", "einstein.json", true);
    newRequest.send();
}

function displayBio() {
    document.getElementById("albertbio").style.display = "block";

    document.getElementById("alstatus").style.display = "none";
    document.getElementById("biobutton").style.display = "none";
}


/*
$(document).ready(function () {

//    $("#albertbio").hide(); Screen stutter, use display: none instead.

    $("button").click(function () {

        $("#albertbio").show();

        $(".alstatus").hide();
        $("button").hide();
    });
});
*/

// Execute
$(document).ready(function () {
    getAlbert();
});

