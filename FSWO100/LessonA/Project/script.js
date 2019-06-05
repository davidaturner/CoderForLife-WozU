//alert('script works!');
function idCard() {

    var firstName = document.getElementById('firstname').value;
    var lastName = document.getElementById('lastname').value;

    var postFullName = document.getElementById('postFullName');
    postFullName.innerHTML = firstName + " " + lastName;
    if (postFullName.innerHTML < 2) {
        postFullName.innerHTML = "Your Name";
    }

    var address = document.getElementById('address').value;
    postAddress.innerHTML = "<em>" + address + "</em>";

    var age = document.getElementById('age').value;
    var phone = document.getElementById('phone').value;

    var numberArray = [];
    numberArray.push(age);
    numberArray.push(phone);
    numberArray.forEach(function (element) {
        var elementstr = "<em>" + element + "</em>";
        if (element <= 100) {
            document.getElementById('postAge').innerHTML = elementstr;
        }
        else {
            document.getElementById('postPhone').innerHTML = elementstr;
        }
    });

    document.getElementById('idcard').hidden = false;
}

function reset() {

    document.getElementById("idcard").hidden = true;

    document.getElementById('firstname').value = "";
    document.getElementById('lastname').value = "";
    document.getElementById('address').value = "";
    document.getElementById('age').value = "";
    document.getElementById('phone').value = " ";

    document.getElementById('postFullName').innerHTML = "";
    document.getElementById('postAddress').innerHTML = "";
    document.getElementById('postAge').innerHTML = "";
    document.getElementById('postPhone').innerHTML = "";

}

reset();

