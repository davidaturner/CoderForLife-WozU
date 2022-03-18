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
fred.name = 'Fred Wilkenson';
console.log("Hi, my name is " + fred.name + ", " + fred.age + ".");

// Alternatively
const personName: any = 'Fred Wilkenson';

const fredName = <string>personName;
console.log("Yep! My name is " + fredName + ".");