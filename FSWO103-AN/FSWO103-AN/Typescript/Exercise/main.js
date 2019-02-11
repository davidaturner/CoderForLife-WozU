"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    }
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var message = "Hello, my World!";
console.log("message = " + message);
var x = 10;
var y = 20;
var z = true;
var a = 25;
var b = "Lopey";
var c;
var sentence = 'Hi, my name is %s';
console.log("Sentence = " + sentence, b);
console.log("This is %cMy delishness message", "color: yellow; font-style: italic; background-color: blue;padding: 2px");
/* Tuples */
/* An array of multiple types. */
/* Fixed elements. Fixed order. */
var person = ["Chris", 22];
console.log("Person = " + person);
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Blue"] = 1] = "Blue";
    Color[Color["Green"] = 2] = "Green";
})(Color || (Color = {}));
;
var myColor = Color.Green; /* Green = 2 */
console.log("Color = " + myColor);
var randomware = 10;
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
var purpose = "Pog";
var purposewname = purpose.name; // ok but undefined
// purpose.name = "Fromme"; //ok but not allowed at RUNTIME!
var myVariable;
// let myVariablewname = myVariable.name; // not allowed. object is type 'unknown'
var myAny = purpose;
var myAnywname = purpose.name;
// let myUnknown : string = myVariable;
//console.log("MyAny = " + myAny.name);
console.log("MyAnywname = " + purposewname);
// console.log("MyUnknown = " + myUnknown.name);
function hasName(obj) {
    return !!obj &&
        typeof obj === "object" &&
        "name" in obj;
}
if (hasName(myVariable)) {
    console.log(myVariable.name);
}
console.log(purpose);
purpose = 10;
var purposestr = purpose;
console.log(purpose.toString); // prints as a function
console.log(purposestr); // prints as '10' string.
var value = 10;
console.log("First value = " + value);
value = true;
console.log("Second value = " + value);
function add(x, y) {
    return x + y;
}
;
console.log("ADDING 5 and 10 = " + add(5, 10));
//console.log("ADDING just 5 = " + add(5)); // ok but realtime result is Nan!
/* Optional parameters come last */
function addOneOrTwo(x, y) {
    if (y === void 0) { y = 25; }
    return (y) ? x + y : x;
}
;
console.log("ADDINGOT 5 and 10 = " + addOneOrTwo(5, 10));
console.log("ADDINGOT just 5 = " + addOneOrTwo(5));
// Interface
function printName(person) {
    console.log(person.firstName + " " + person.lastName);
}
;
var myPerson = {
    firstName: "Bruce",
    lastName: "Dwayne"
};
console.log("My name is : ");
printName(myPerson);
console.log("Logging... " + (myPerson.firstName + " " + myPerson.lastName));
;
function printPerson(test) {
    printName(test);
}
console.log("My person name is : ");
printPerson(myPerson);
/* Class */
var Employee = /** @class */ (function () {
    function Employee(employeeName) {
        this.employeeName = employeeName;
    }
    Employee.prototype.getName = function () {
        return this.employeeName;
    };
    Employee.prototype.greet = function () {
        console.log("Hi, my name is " + this.employeeName);
    };
    return Employee;
}());
var emp = new Employee("Froth Stitler");
console.log("Employeename = " + emp.getName());
emp.greet();
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(managerName) {
        return _super.call(this, managerName) || this;
    }
    Manager.prototype.delegateWork = function (emp) {
        console.log("Manager " + this.getName() + " is delegating the Work to " +
            emp.getName());
    };
    return Manager;
}(Employee));
var man = new Manager("Pog Miller");
console.log("New Manager = " + man.getName());
man.delegateWork(emp);
//# sourceMappingURL=main.js.map