"use strict";
var Animal = /** @class */ (function () {
    function Animal(name, whoAmI) {
        this.name = name;
        this.whoAmI = whoAmI;
    }
    Animal.prototype.describe = function () {
        describe(this.name, this.whoAmI);
    };
    return Animal;
}());
function describe(name, whoAmI) {
    console.log("Hi, my name is " + name + ". I am a(n) " + whoAmI + ".");
}
var DONT_KNOW = "I don't know how I am born.";
var LIVE_BORN = "I am live born.";
var Mammal = /** @class */ (function () {
    function Mammal(name, whoAmI) {
        this.name = name;
        this.whoAmI = whoAmI;
    }
    Mammal.prototype.describe = function () {
        describe(this.name, this.whoAmI);
        console.log(this.birthMethod());
    };
    Mammal.prototype.birthMethod = function () {
        return LIVE_BORN;
    };
    return Mammal;
}());
var Bat = /** @class */ (function () {
    function Bat(name, whoAmI, canFly) {
        this.fly = false;
        this.name = name;
        this.whoAmI = whoAmI;
        this.fly = canFly;
    }
    Bat.prototype.describe = function () {
        describe(this.name, this.whoAmI);
        console.log(this.birthMethod());
        this.canFly();
    };
    Bat.prototype.birthMethod = function () {
        return LIVE_BORN;
    };
    Bat.prototype.canFly = function () {
        console.log((this.fly) ? "And, I can fly." : "And, um, I cannot fly.");
    };
    return Bat;
}());
var animal = new Animal("Toby", "Duck");
animal.describe();
console.log();
var mammal = new Mammal("Goofy", "Dawg");
mammal.describe();
console.log();
var bat = new Bat("Drac", "Vampire Bat", true);
bat.describe();
