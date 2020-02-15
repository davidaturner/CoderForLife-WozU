"use strict";
var somethingFun = "Riding my bike is fun!";
console.log(somethingFun);
function orderFood(sandwich, orderNumber) {
    console.log("Your order number is " +
        orderNumber +
        " and contains a " +
        sandwich +
        " sandwich.");
}
orderFood("Ham and Cheese", 13);
var age = 12;
var ageAsAString = age.toString();
var greeting = "Hi! My age is " + ageAsAString;
console.log(greeting);
var speedLimit = "55";
var hagerposition = "I can't drive... " + speedLimit + "!";
console.log(hagerposition);
var lowerit = parseInt(speedLimit) - 5;
console.log(lowerit);
var fred = {};
fred.name = "Paddy";
fred.age = 57;
console.log(fred.age);
function makeMeASammich(basket) {
    console.log("Your sammich, having " +
        basket.numberOfItems +
        " yummy items, includes " +
        basket.ingredients +
        ", coming to a total of " +
        basket.calories +
        " calories.");
}
var sammichIngredients = {
    numberOfItems: 3,
    ingredients: ["hamburger meat", "pickels", "tomato"],
    calories: 500
};
makeMeASammich(sammichIngredients);
var AppointmentDateFormatter = /** @class */ (function () {
    function AppointmentDateFormatter(day, month, year) {
        this.currentTime = new Date(year, month, day);
    }
    AppointmentDateFormatter.prototype.printDate = function () {
        console.log(this.currentTime.toDateString());
    };
    return AppointmentDateFormatter;
}());
var dateOfAppointment = new AppointmentDateFormatter(23, 11, 1961);
dateOfAppointment.printDate();
var Bat = /** @class */ (function () {
    function Bat(name) {
        this.name = name;
    }
    Bat.prototype.whoAmI = function () {
        console.log("I'm " + this.name + "!");
    };
    Bat.prototype.brushHair = function () {
        console.log("I must brush my hair so that I am pretty.");
    };
    Bat.prototype.fly = function () {
        console.log("Look ma! No hands!");
    };
    return Bat;
}());
var batrok = new Bat("batrok");
console.log(batrok.name);
batrok.whoAmI();
batrok.brushHair();
batrok.fly();
