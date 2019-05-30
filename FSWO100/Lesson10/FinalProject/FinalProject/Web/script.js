function initialize() {
    var postIdDO = document.getElementById("postId");
    postIdDO.hidden;
}

function idCard() {

    var firstNameDO = document.getElementById("firstname");
    var lastNameDO = document.getElementById("lastname");
    var addressDO = document.getElementById("address");

    var postFullNameDO = document.getElementById("postFullName");
    var postAddressDO = document.getElementById("postAddress");

    postFullNameDO.innerHTML = firstNameDO.value + " " + lastNameDO.value;
    postAddressDO.innerHTML = addressDO.value;

    var ageDO = document.getElementById("age");
    var phoneDO = document.getElementById("phone");

    var postAgeDO = document.getElementById("postAge");
    var postPhoneDO = document.getElementById("postPhone");

    postAgeDO.innerHTML = ageDO.value;
    postPhoneDO.innerHTML = phoneDO.value;

    var postIdDO = document.getElementById("postId");
    postIdDO.visible;

    console.log(firstNameDO.value + " " + lastNameDO.value);
    console.log(ageDO.value);
    console.log(phoneDO.value);
    console.log(addressDO.value);
}

initialize();

