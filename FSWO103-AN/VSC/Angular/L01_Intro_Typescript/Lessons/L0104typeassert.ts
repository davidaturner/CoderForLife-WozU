interface Person {
  age: number;
  name: string;
}

var fred = {} as Person;

fred.age = 57;
fred.name = "Fred Wilkenson";

console.log(fred.age);
console.log(fred.name);

const personName: any = "Rocky Raccoon";
const fredName = <string>personName;

console.log(fredName);
