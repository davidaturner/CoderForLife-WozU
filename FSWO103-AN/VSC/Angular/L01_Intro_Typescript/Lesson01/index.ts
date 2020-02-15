const somethingFun: string = "Riding my bike is fun!";
console.log(somethingFun);

function orderFood(sandwich: string, orderNumber: number): void {
  console.log(
    "Your order number is " +
      orderNumber +
      " and contains a " +
      sandwich +
      " sandwich."
  );
}

orderFood("Ham and Cheese", 13);

const age: number = 12;
const ageAsAString: string = age.toString();
const greeting = "Hi! My age is " + ageAsAString;
console.log(greeting);

const speedLimit: string = "55";
const hagerposition: string = "I can't drive... " + speedLimit + "!";
console.log(hagerposition);
const lowerit = parseInt(speedLimit) - 5;
console.log(lowerit);

interface Person {
  name: string;
  age: number;
}

const fred = {} as Person;
fred.name = "Paddy";
fred.age = 57;
console.log(fred.age);

interface IngredientsBasket {
  numberOfItems: number;
  ingredients: string[];
  calories: number;
}

function makeMeASammich(basket: IngredientsBasket): void {
  console.log(
    "Your sammich, having " +
      basket.numberOfItems +
      " yummy items, includes " +
      basket.ingredients +
      ", coming to a total of " +
      basket.calories +
      " calories."
  );
}

const sammichIngredients = {
  numberOfItems: 3,
  ingredients: ["hamburger meat", "pickels", "tomato"],
  calories: 500
};
makeMeASammich(sammichIngredients);

interface Lifespan {
  printDate(): void;
}

class AppointmentDateFormatter implements Lifespan {
  currentTime: Date;

  constructor(day: number, month: number, year: number) {
    this.currentTime = new Date(year, month, day);
  }

  printDate(): void {
    console.log(this.currentTime.toDateString());
  }
}

const dateOfAppointment = new AppointmentDateFormatter(23, 11, 1961);
dateOfAppointment.printDate();

interface Animal {
  whoAmI(): void;
}
interface Mammal {
  brushHair(): void;
}
interface Winged {
  fly(): void;
}

class Bat implements Animal, Mammal, Winged {
  name: string;

  constructor(name: string) {
    this.name = name;
  }

  whoAmI(): void {
    console.log("I'm " + this.name + "!");
  }

  brushHair(): void {
    console.log("I must brush my hair so that I am pretty.");
  }

  fly(): void {
    console.log("Look ma! No hands!");
  }
}

let batrok = new Bat("batrok");
console.log(batrok.name);
batrok.whoAmI();
batrok.brushHair();
batrok.fly();
