interface Person {
  firstName: string;
  lastName?: string;
}
interface Contact {
  phoneNumber: number;
  email?: string;
}

class ContactCard implements Person, Contact {
  firstName: string;
  phoneNumber: number;

  constructor(firstname: string, phonenumber: number) {
    this.firstName = firstname;
    this.phoneNumber = phonenumber;
  }
  sendMessage(): void {
    console.log(
      "Name: " + this.firstName + ", Phone Number: " + this.phoneNumber
    );
  }
}

let card = new ContactCard("Henry", 4125551212);
card.sendMessage();
