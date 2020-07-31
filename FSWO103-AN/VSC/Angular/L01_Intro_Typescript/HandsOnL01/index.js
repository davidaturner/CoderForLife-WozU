var ContactCard = /** @class */ (function () {
    function ContactCard(firstname, phonenumber) {
        this.firstName = firstname;
        this.phoneNumber = phonenumber;
    }
    ContactCard.prototype.sendMessage = function () {
        console.log("Name: " + this.firstName + ", Phone Number: " + this.phoneNumber);
    };
    return ContactCard;
}());
var card = new ContactCard("Henry", 4125551212);
card.sendMessage();
