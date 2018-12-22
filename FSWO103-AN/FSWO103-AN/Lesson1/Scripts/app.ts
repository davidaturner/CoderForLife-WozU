interface IPerson {
    firstName: string;
    lastName: string;

    birthday: Date;

    printPerson(): void;
}

interface IContact {
    phoneNumber: any;
    formatNumber(number: string): string;

    emailAddress: string;
    slackAddress: string;

    printContact(): void;
}

class ContactCard implements IPerson, IContact {

    constructor(firstName: string, phoneNumber: any, lastName?:string, birthday?:Date,
        emailAddress?:string, slackAddress?:string) {

        this.firstName = firstName;
        this.lastName = lastName;

        this.birthday = birthday;

        this.phoneNumber = phoneNumber;

        this.emailAddress = emailAddress;
        this.slackAddress = slackAddress;

    }

    firstName: string;
    lastName: string;

    birthday: Date;
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
    }

    phoneNumber: any;
    formatNumber(number:string): string {
        return (number == null) ? null :
            "(" + number.substring(0, 3) + 
            ")" + number.substring(3, 6) + 
            "-" + number.substring(6, 10);
    }

    emailAddress: string;
    slackAddress: string;
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
    }

    sendMessage(): void {
        console.log("Sending a message.")
    }

    addToFavorite(): void {
        console.log("Add to favorite.")
    }

}

const sam = new ContactCard("Sam", 4122237766, "Turner", new Date(1933, 5, 11),
     "turnin19@earthlink.net", "sambturner");
sam.printPerson();
sam.printContact();
sam.sendMessage();
sam.addToFavorite();

const andave = new ContactCard("Dave", 4122237766, undefined, undefined,
    "turnin21@earthlink.net");
andave.printPerson();
andave.printContact();
andave.sendMessage();
andave.addToFavorite();

