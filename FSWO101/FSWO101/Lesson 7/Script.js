// alert('Hello World from JS');
function regexChecker() {

    var firstname = document.getElementById("firstname");
    var lastname = document.getElementById("lastname");

    console.log(firstname.value);
    console.log(lastname.value);

    let nameRegex = "^[A-Z][a-zA-Z ]*";

    if (firstname.value.match(nameRegex) &&
        lastname.value.match(nameRegex)) {
        console.log(true);
        alert("Yay! Your inputs were all correct!");

    }
    else {
        console.log(false);
        alert("Oh no! Thats an invalid format!");
    }
}
