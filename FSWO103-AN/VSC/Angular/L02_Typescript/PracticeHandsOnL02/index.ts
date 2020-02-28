// Step 1
interface Person {
  firstName: string;
  lastName: string;
  birthdate: Date;
}

class Entry implements Person {
  firstName: string;
  lastName: string;
  birthdate: Date;
  constructor(firstName: string, lastName: string, birthdate: Date) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdate = birthdate;
  }
}

const newPerson = new Entry("Albert", "Einstein", new Date("5/14/1879"));
console.log(
  `First: ${newPerson.firstName}, Last: ${newPerson.lastName}, Birth: ${newPerson.birthdate}`
);

// Step 2
const numbers = Array(
  "twelve",
  "one-hundred",
  "sixteen",
  "forty-four",
  "seventy-three",
  "three-million"
);

function sortArray<T>(argument: T[]): T[] {
  return argument.sort();
}
function logArray<T>(prompt: string, argument: T[]): void {
  let i = 0;
  let stringbuffer = prompt + ": ";
  while (i < argument.length) {
    stringbuffer += argument[i];
    if (i < argument.length - 1) {
      stringbuffer += ", ";
    }
    i++;
  }
  console.log(stringbuffer);
}

logArray("Array before sorting", numbers);
const sorted = sortArray(numbers);
logArray("Array after sorting", sorted);
console.log();
