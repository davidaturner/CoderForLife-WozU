"use strict";
/*
Decorators provide a way to add functionality to parts of an application or program
and are used extensively in Angular. Decorators, denoted by the @ sign, are functions
(including necessary parameters, explained further on) that are evaluated by another
function at runtime with information about the declaration.

In Angular there are four decorator types: (Class | Property | Method | Parameter)
*/
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
/* Method decorator */
/*
A method decorator has the three following parameters:

target: The prototype (Object) of the class.
propertyKey: The name (string) of the method being decorated.
descriptor: A descriptor (PropertyDescriptor) of the given property if it exists on
the object, otherwise undefined.
*/
/* Example 1 */
/*
function methodDecorator(target: Object, propertyKey: string, descriptor: PropertyDescriptor): any {
    let oldValue = descriptor.value;

    descriptor.value = function() {
        console.log(`Calling ${propertyKey} with `, target);
        let value = oldValue.apply(null, [arguments[1], arguments[0]]);

        console.log(`Function is executed`);
        return value + '; Decorators are crazy!';
    };

    return descriptor;
}
*/
/* Example 2 */
function methodDecorator(target, propertyKey, descriptor) {
    // store the original class method in `oldValue`
    var oldValue = descriptor.value;
    // re-define the class method
    descriptor.value = function () {
        // when the class method is called, log the fact to the console
        console.log("Calling " + propertyKey + " with ", target);
        // call the original class method passing in the caller's two arguments
        // -- this point is where the console logging in the class
        // method will occur
        var value = oldValue.apply(null, [arguments[1], arguments[0]]);
        // log that the function was executed and return the result with some added text
        console.log("Function is executed");
        return value + '; Decorators are crazy!';
    };
    return descriptor;
}
var MyClass = /** @class */ (function () {
    function MyClass() {
    }
    //add the below decorator expression
    MyClass.prototype.exampleFunction = function (arg1, arg2) {
        // log the arguments and return their concatenation
        console.log("Arguments Received: " + arg1 + " and " + arg2);
        return arg1 + " " + arg2;
    };
    __decorate([
        methodDecorator,
        __metadata("design:type", Function),
        __metadata("design:paramtypes", [String, String]),
        __metadata("design:returntype", void 0)
    ], MyClass.prototype, "exampleFunction", null);
    return MyClass;
}());
var run = new MyClass();
console.log(run.exampleFunction('Hello', 'World'));
