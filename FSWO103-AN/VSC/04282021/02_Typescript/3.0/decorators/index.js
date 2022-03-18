"use strict";
/*
Property Decorators: Property decorators are similar to method decorators, but they
only require two parameters:
    target: The prototype of the class.
    propertyKey: The name (string) of the method being decorated.

Class Decorators: Class decorators allow you to modify the constructor of a class
by either changing or adding new properties and methods to the class in question.
Class decorators only require one parameter:
    target: The prototype of the class.
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
// 1. Class decorator
function InspectClass(target) {
    console.log("Class in use: " + target.name);
}
// 2a. Property decorator
function InspectProperty(target, propertyKey) {
    var val = target[propertyKey];
    // 2b. this runs when a property is read
    var getter = function () {
        console.log("Get: " + propertyKey + " => " + val);
        return val;
    };
    // this runs when a property's value is set
    var setter = function (newValue) {
        console.log("Set: " + propertyKey + " => " + newValue);
        val = newValue;
    };
    // 2c. below, the `delete` removes the property from the class
    // then with your Object.defineProperty() function, you are
    // re-adding the property with a new getter and setter.
    if (delete target[propertyKey]) {
        Object.defineProperty(target, propertyKey, {
            get: getter,
            set: setter
        });
    }
}
// 3a. `Automobile` class uses `InspectClass` class decorator
var Automobile = /** @class */ (function () {
    function Automobile(make, model, year) {
        // 3c. when an instance of `Automobile` is created, its properties
        // will get set, so the decorator for the `make` property
        // will result in information getting logged to the console
        this.make = make;
        // the next two properties do not have decorators
        this.model = model;
        this.year = year;
    }
    // 3d. this method accesses the properties, of which `make` is decorated
    // so when `getInfo()` is called, it will result in information
    // getting logged to the console about `make`
    Automobile.prototype.getInfo = function () {
        return "Make: " + this.make + "  Model: " + this.model + "  Year: " + this.year;
    };
    __decorate([
        InspectProperty,
        __metadata("design:type", String)
    ], Automobile.prototype, "make", void 0);
    Automobile = __decorate([
        InspectClass,
        __metadata("design:paramtypes", [String, String, Number])
    ], Automobile);
    return Automobile;
}());
var mazda = new Automobile("Mazda", "RX-8", 2003);
console.log(mazda.getInfo());
