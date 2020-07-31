// Part 1
interface Person {
  firstname: string;
  lastname: string;
  birthdate: Date;
}

class Entry implements Person {
  firstname: string;
  lastname: string;
  birthdate: Date;

  constructor(firstname: string, lastname: string, birthdate: Date) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthdate = birthdate;
  }
}

let newPerson = new Entry("Albert", "Einstein", new Date("05/14/1879"));
console.log(
  `First Name: ${newPerson.firstname}, Last Name: ${newPerson.lastname}, Birthday: ${newPerson.birthdate}`
);

// Part two
let numbers = [
  "twelve",
  "one-hundred",
  "sixteen",
  "forty-four",
  "seventy-three",
  "three-million",
];

function sortArray<S>(argument: S[]): S[] {
  return argument.sort();
}

console.log(
  `Array before sorting: ${numbers[0]},${numbers[1]},${numbers[2]},${numbers[3]},${numbers[4]},${numbers[5]}`
);
let sorted = sortArray(numbers);
console.log(
  `Array after sorting: ${sorted[0]},${sorted[1]},${sorted[2]},${sorted[3]},${sorted[4]},${sorted[5]}`
);
