interface IPerson {
    firstName: string;
    lastName?: string;

    birthday?: Date;

    printPerson(): void;
}

interface IContact {
    phoneNumber: any;
    formatNumber(number: string): string;

    emailAddress?: string;
    slackAddress?: string;

    printContact(): void;
}

interface IContactCard extends IPerson, IContact {

    sendMessage(): void;
    addToFavorite(): void;
}

/* To promote code reusability it would be better to create
 * a Concrete class ContactCard than repeating forced code using
 * interfaces only.. see myapp.ts.
 */
const samh: IContactCard = {

    firstName: "Sam",
    lastName: "Turner",

    birthday: new Date(1933, 5, 12),

    printPerson(): void {
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
    formatNumber(number: string): string {
        return (number == null) ? null :
            "(" + number.substring(0, 3) +
            ")" + number.substring(3, 6) +
            "-" + number.substring(6, 10);
    },

    emailAddress: "turnin21@earthlink.net",
    slackAddress: "sambturner",

    printContact(): void {
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

    sendMessage(): void {
        console.log("Send a message")
    },

    addToFavorite(): void {
        console.log("Add to Favorites")
    }
}

sam.printPerson();
sam.printContact();
sam.sendMessage();
//sam.addToFavorite();

const andaveh: IContactCard = {

    firstName: "David",
 //   lastName: "Turner",

//    birthday: new Date(1933, 5, 11),

    printPerson(): void {
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
    formatNumber(number: string): string {
        return (number == null) ? null :
            "(" + number.substring(0, 3) +
            ")" + number.substring(3, 6) +
            "-" + number.substring(6, 10);
    },

    emailAddress: "turnin19@earthlink.net",
//    slackAddress: "davidaturner",

    printContact(): void {
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

    sendMessage(): void {
        console.log("Send a message")
    },

    addToFavorite(): void {
        console.log("Add to Favorites")
    }
}

andave.printPerson();
andave.printContact();
//andave.sendMessage();
andave.addToFavorite();

