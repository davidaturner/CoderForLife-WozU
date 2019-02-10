/* To promote code reusability it would be better to create
 * a Concrete class ContactCard than repeating forced code using
 * interfaces only.. see myapp.ts.
 */
var samh = {
    firstName: "Sam",
    lastName: "Turner",
    birthday: new Date(1933, 5, 12),
    printPerson: function () {
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
    },
    phoneNumber: 4122348877,
    formatNumber: function (number) {
        return (number == null) ? null :
            "(" + number.substring(0, 3) +
                ")" + number.substring(3, 6) +
                "-" + number.substring(6, 10);
    },
    emailAddress: "turnin21@earthlink.net",
    slackAddress: "sambturner",
    printContact: function () {
        console.log("Contact:");
        console.log("P " + this.formatNumber(this.phoneNumber.toString()));
        if (this.emailAddress != undefined) {
            console.log("E " + this.emailAddress);
        }
        if (this.slackAddress != undefined) {
            console.log("S " + this.slackAddress);
        }
        console.log("  DONE!");
    },
    sendMessage: function () {
        console.log("Send a message");
    },
    addToFavorite: function () {
        console.log("Add to Favorites");
    }
};
samh.printPerson();
samh.printContact();
samh.sendMessage();
//samh.addToFavorite();
var andaveh = {
    firstName: "David",
    //   lastName: "Turner",
    //    birthday: new Date(1933, 5, 11),
    printPerson: function () {
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
    },
    phoneNumber: 4122348877,
    formatNumber: function (number) {
        return (number == null) ? null :
            "(" + number.substring(0, 3) +
                ")" + number.substring(3, 6) +
                "-" + number.substring(6, 10);
    },
    emailAddress: "turnin19@earthlink.net",
    //    slackAddress: "davidaturner",
    printContact: function () {
        console.log("Contact:");
        console.log("P " + this.formatNumber(this.phoneNumber.toString()));
        if (this.emailAddress != undefined) {
            console.log("E " + this.emailAddress);
        }
        if (this.slackAddress != undefined) {
            console.log("S " + this.slackAddress);
        }
        console.log("  DONE!");
    },
    sendMessage: function () {
        console.log("Send a message");
    },
    addToFavorite: function () {
        console.log("Add to Favorites");
    }
};
andaveh.printPerson();
andaveh.printContact();
//andaveh.sendMessage();
andaveh.addToFavorite();
//# sourceMappingURL=HandsOn1.js.map