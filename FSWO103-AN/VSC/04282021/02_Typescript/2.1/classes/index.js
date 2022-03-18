"use strict";
var Rectangle = /** @class */ (function () {
    // Can only have one constructor.
    function Rectangle(height, width) {
        this.height = height;
        this.width = width;
    }
    Rectangle.prototype.perimeter = function () {
        return this.height * 2 + this.width * 2;
    };
    return Rectangle;
}());
var rectangle = new Rectangle(2, 3);
console.log("The perimeter of a rectangle with sides " + rectangle.height +
    " and " + rectangle.width +
    " is: " + rectangle.perimeter());
/* Unnamed class
const Rectangle = class {
    height: number;
    width: number;
    constructor(height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    perimeter() {
        return this.height * 2 + this.width * 2;
    }
};
*/
/* Named class
const Rectangle = class Rectangle {
    height: number;
    width: number;
    constructor(height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    perimeter() {
        return this.height * 2 + this.width * 2;
    }
};
*/ 
