interface Person {
  getFirstName(): string;
  lastName?: string;
}

interface Contact {
  getPhoneNumber(): number;
  email?: string;
}

class ContactCard implements Person, Contact {
  firstName: string;
  lastName?: string;
  phoneNumber: number;
  email?: string;

  constructor(firstName: string, phoneNumber: number) {
    this.firstName = firstName;
    this.phoneNumber = phoneNumber;
  }
  getFirstName(): string {
    return this.firstName;
  }
  getPhoneNumber(): number {
    return this.phoneNumber;
  }
  sendMessage(): void {
    console.log(
      "Name: " + this.firstName + ", Phone Number: " + this.phoneNumber
    );
  }
}

const newPerson = new ContactCard("Henry", 1234567890);
newPerson.lastName = "Fripp";
console.log(newPerson.getFirstName() + " " + newPerson.lastName);
console.log(newPerson.getPhoneNumber());

newPerson.sendMessage();
