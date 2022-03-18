"use strict";
var Bat = /** @class */ (function () {
    function Bat(name) {
        this.name = name;
    }
    Bat.prototype.whoAmI = function () {
        console.log("I'm " + this.name + "!");
    };
    Bat.prototype.brushHair = function () {
        console.log("I must brush my hair to look pretty!");
    };
    Bat.prototype.fly = function () {
        console.log("Look! I can fly!");
    };
    return Bat;
}());
var bat = new Bat("Bartok");
bat.whoAmI();
bat.brushHair();
bat.fly();
