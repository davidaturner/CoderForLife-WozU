interface Person {
    firstname : string;
    lastname : string;
}

interface Contact {
    phonenumber : string;
    email? : string;
}

class ContactCard implements Person, Contact {
    firstname : string;
    lastname : string;
    phonenumber : string;
    email : string;
    constructor(firstname : string, phonenumber : string) {
            this.firstname = firstname;
            this.lastname = "";
            this.phonenumber = phonenumber;
            this.email = "";
        }

    sendMessage() {
        console.log("Name : " + this.firstname + 
                    ", Phone Number  : " + this.phonenumber);
    }
}

const newPerson = new ContactCard("Henry", "1-412-555-2219");
newPerson.sendMessage();