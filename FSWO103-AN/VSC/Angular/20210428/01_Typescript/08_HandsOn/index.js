"use strict";
var ContactCard = /** @class */ (function () {
    function ContactCard(firstname, phonenumber) {
        this.firstname = firstname;
        this.lastname = "";
        this.phonenumber = phonenumber;
        this.email = "";
    }
    ContactCard.prototype.sendMessage = function () {
        console.log("Name : " + this.firstname +
            ", Phone Number  : " + this.phonenumber);
    };
    return ContactCard;
}());
var newPerson = new ContactCard("Henry", "1-412-555-2219");
newPerson.sendMessage();
