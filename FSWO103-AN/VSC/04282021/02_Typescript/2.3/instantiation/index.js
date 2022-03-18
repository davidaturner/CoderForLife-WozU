"use strict";
var Rectangle = /** @class */ (function () {
    function Rectangle(height, width) {
        this.height = height;
        this.width = width;
    }
    Rectangle.prototype.perimeter = function () {
        return this.height * 2 + this.width * 2;
    };
    return Rectangle;
}());
var myYard = new Rectangle(24, 32);
console.log(myYard);
console.log(myYard.perimeter());
var myYard2Perimeter = new Rectangle(1, 2).perimeter();
console.log(myYard2Perimeter);
