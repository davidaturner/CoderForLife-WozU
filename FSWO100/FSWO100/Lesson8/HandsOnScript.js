//alert('Welcome to the Website!');
function nameInfo() {

    var firstName = document.getElementById("firstname").value;
    var middleName = document.getElementById("middlename").value;
    var lastName = document.getElementById("lastname").value;
    console.log(firstName);
    console.log(middleName);
    console.log(lastName);

    var fullName = firstName + " " + middleName + " " + lastName;

    var fullNameContents = document.getElementById("fullname");
    console.log(fullName);

    fullNameContents.innerHTML = fullName;

}

