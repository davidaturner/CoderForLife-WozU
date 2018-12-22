var ContactCard = /** @class */ (function () {
    function ContactCard(firstName, phoneNumber, lastName, birthday, emailAddress, slackAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.slackAddress = slackAddress;
    }
    ContactCard.prototype.printPerson = function () {
        console.log("Personal:");
        if (this.lastName != undefined) {
            console.log("N " + this.firstName + " " + this.lastName);
        }
        else {
            console.log("F " + this.firstName);
        }
        if (this.birthday != undefined) {
            console.log("B " + this.birthday);
        }
        console.log("  DONE!");
    };
    ContactCard.prototype.formatNumber = function (number) {
        return (number == null) ? null :
            "(" + number.substring(0, 3) +
                ")" + number.substring(3, 6) +
                "-" + number.substring(6, 10);
    };
    ContactCard.prototype.printContact = function () {
        console.log("Contact:");
        console.log("P " + this.formatNumber(this.phoneNumber.toString()));
        if (this.emailAddress != undefined) {
            console.log("E " + this.emailAddress);
        }
        if (this.slackAddress != undefined) {
            console.log("S " + this.slackAddress);
        }
        console.log("  DONE!");
    };
    ContactCard.prototype.sendMessage = function () {
        console.log("Sending a message.");
    };
    ContactCard.prototype.addToFavorite = function () {
        console.log("Add to favorite.");
    };
    return ContactCard;
}());
var sam = new ContactCard("Sam", 4122237766, "Turner", new Date(1933, 5, 11), "turnin19@earthlink.net", "sambturner");
sam.printPerson();
sam.printContact();
sam.sendMessage();
sam.addToFavorite();
var andave = new ContactCard("Dave", 4122237766, undefined, undefined, "turnin21@earthlink.net");
andave.printPerson();
andave.printContact();
andave.sendMessage();
andave.addToFavorite();
