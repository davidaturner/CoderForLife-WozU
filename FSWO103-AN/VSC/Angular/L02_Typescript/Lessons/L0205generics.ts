// Simple T example
function identityType00<T>(argument: T): string {
  let argType = "";

  switch (typeof argument) {
    case "number":
      argType = "number";
      break;
    case "string":
      argType = "string";
      break;
    default:
      argType = "neither number nor string";
  }

  return "You have passed in a value of " + argument + " which is " + argType;
}

console.log(identityType00(42));
console.log(identityType00("christmas"));
console.log(identityType00(4.2));
console.log(identityType00("c"));

// T[] Example
function identityType01<T>(argument: T[]): T[] {
  console.log(argument + ": " + argument.length);
  return argument;
}

let a_groceryList: string[] = ["eggs", "milk", "bacon", "syrup"];
let b_groceryList: Array<string> = [
  "bread",
  "coffee",
  "mustard",
  "toilet paper",
  "kleenex",
];

identityType01(a_groceryList);
identityType01(b_groceryList);

// T extend <interface>. Will only work with classes HAVING the interface property.
interface lengthProperty {
  length: number;
}
function identityType02<T extends lengthProperty>(argument: T): T {
  console.log(argument + ": " + argument.length);
  argument.length *= 100;
  return argument;
}
class WordCounter implements lengthProperty {
  msg: string;
  length: number;

  constructor(msg: string, length: number) {
    this.msg = msg;
    this.length = length;
  }
}

let msg01 = "This is it!";
let argument01: WordCounter;
let msg02 = "Hello, World!";
let argument02: WordCounter;

argument01 = identityType02(new WordCounter(msg01, 3));
argument02 = identityType02(new WordCounter(msg02, 2));

console.log(argument01.msg + ": " + argument01.length);
console.log(argument02.msg + ": " + argument02.length);
