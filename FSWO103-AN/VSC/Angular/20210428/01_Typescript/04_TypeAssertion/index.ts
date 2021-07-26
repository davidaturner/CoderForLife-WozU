console.log("Ready!")
/*
var fred = {};
fred.age = 57; // Error: property 'age' does not exist on `{}`
fred.name = 'Fred Wilkenson'; // Error: property 'name' does not exist on `{}`
*/
interface Person {
    age: number;
    name: string;
}
const fred = {} as Person;
fred.age = 57;
fred.name = "Fred Wilkenson";
console.log ("Hi, " + fred.name + ", " + fred.age);

const anyType : any = "Thomas Quiet";
const thomasName : string = <string>anyType;
console.log("Hi, " + thomasName + ".");