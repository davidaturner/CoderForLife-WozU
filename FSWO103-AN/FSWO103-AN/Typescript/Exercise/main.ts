/* 
 * Need export so that js script will be treated
 * as a module... not a script. 
 * */
export { }
let message = "Hello, my World!"
console.log("message = " + message);

let x = 10;
const y = 20;

let z: boolean = true;
let a: number = 25;
let b: string = "Lopey";
let c: string;

let sentence: string = 'Hi, my name is %s';
console.log("Sentence = " + sentence, b);
console.log("This is %cMy delishness message", "color: yellow; font-style: italic; background-color: blue;padding: 2px");

/* Tuples */
/* An array of multiple types. */
/* Fixed elements. Fixed order. */
let person: [string, number] = ["Chris", 22];
console.log("Person = " + person);

enum Color { "Red", "Blue", "Green" };
let myColor: Color = Color.Green; /* Green = 2 */
console.log("Color = " + myColor);

let randomware: any = 10;
randomware = true;
randomware = "Random";
console.log("Randomware = " + randomware);
/*
 * [..] unknown which is the type-safe counterpart of any. Anything is assignable 
 * to unknown, but unknown isn't assignable to anything but itself and any without 
 * a type assertion or a control flow based narrowing. Likewise, no operations are 
 * permitted on an unknown without first asserting or narrowing to a more specific type.
 * */

/* 
 * In other words, though a value can be assigned to unknown...
 * You cannot assign a variable to that unknown...
 * Nor can you use any "function" assigned to an unknown.
 * 
 * let s1 : any = 10;
 * let s1wname = s1.name;       // ok but undefined
 * let s2 : unknown = 20;
 * let s2wname = s2.name;       // not allowed. object is of type "unknown"
 * 
 * let myAny : string = s1;     // ok
 * let myAnywName = myAny.name; // ok but undefined
 * let myUnknown : string = s2;   // not allowed. cannot not reassign to another type.
 * 
 * myAny.name // not allowed
 * myUnknown.name // not allowed.
 * */
let purpose: any = "Pog";
let purposewname = purpose.name; // ok but undefined
// purpose.name = "Fromme"; //ok but not allowed at RUNTIME!
let myVariable: unknown;
// let myVariablewname = myVariable.name; // not allowed. object is type 'unknown'

let myAny: string = purpose;
let myAnywname = purpose.name;
// let myUnknown : string = myVariable;

//console.log("MyAny = " + myAny.name);
console.log("MyAnywname = " + purposewname);
// console.log("MyUnknown = " + myUnknown.name);

function hasName(obj: any): obj is { name: string } {
    return !!obj &&
        typeof obj === "object" &&
            "name" in obj
}

if (hasName(myVariable)) {
    console.log(myVariable.name);
}

console.log(purpose);
purpose = 10;
let purposestr : string = (purpose as string);
console.log(purpose.toString); // prints as a function
console.log(purposestr);    // prints as '10' string.

let value: number | boolean = 10;
console.log("First value = " + value);
value = true;
console.log("Second value = " + value);

function add(x: number, y: number) {
    return x + y;
};
console.log("ADDING 5 and 10 = " + add(5, 10));
//console.log("ADDING just 5 = " + add(5)); // ok but realtime result is Nan!

/* Optional parameters come last */
function addOneOrTwo(x: number, y: number = 25) {
    return (y)? x + y : x;
};
console.log("ADDINGOT 5 and 10 = " + addOneOrTwo(5, 10));
console.log("ADDINGOT just 5 = " + addOneOrTwo(5));

// Interface
function printName(person: { firstName: string, lastName: string}) {
    console.log(person.firstName + " " + person.lastName);
};

let myPerson = {
    firstName: "Bruce",
    lastName: "Dwayne"
};
console.log("My name is : ");
printName(myPerson);
console.log("Logging... " + `${myPerson.firstName} ${myPerson.lastName}`)
interface person {
    firstName: string;
    lastName: string;
};
function printPerson(test: person) {
    printName(test);
}
console.log("My person name is : ");
printPerson(myPerson)

/* Class */
class Employee {
    private employeeName: string;
    constructor(employeeName: string) {
        this.employeeName = employeeName;
    }

    getName() {
        return this.employeeName;
    }

    greet(){
        console.log("Hi, my name is " + this.employeeName);
    }
}

let emp = new Employee("Froth Stitler");
console.log("Employeename = " + emp.getName());
emp.greet();

class Manager extends Employee {
    constructor(managerName: string) {
        super(managerName);
    }
    delegateWork(emp: Employee) {
        console.log("Manager " + this.getName() + " is delegating the Work to " +
            emp.getName());
    }
}

let man = new Manager("Pog Miller");
console.log("New Manager = " + man.getName());
man.delegateWork(emp);





