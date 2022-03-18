"use strict";
/* All variables and return values are public

class Rectangle {
    public height: number;
    public width: number;
    public constructor(height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    public perimeter() {
        return this.height * 2 + this.width * 2;
    }
}

const perimeter_value = new Rectangle(23, 32).perimeter();
console.log("height: 23 width: 32 perimeter: " + perimeter_value);
*/
/* Return value is private.

class Rectangle {
    height: number;
    width: number;
    constructor(height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    private perimeter() {
        return this.height * 2 + this.width * 2;
    }
}

const perimeter_value = new Rectangle(23, 32).perimeter();
console.log("height: 23 width: 32 perimeter: " + perimeter_value);
*/
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
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
var Square = /** @class */ (function (_super) {
    __extends(Square, _super);
    function Square() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    // Can access perimeter() method only within Square.
    Square.prototype.same = function () {
        return this.perimeter();
    };
    Square.prototype.area = function () {
        return this.height * this.width;
    };
    return Square;
}(Rectangle));
var square = new Square(23, 32);
// const perimeter_value = new Square(23, 32).perimeter(); // Cannot access directly.
var perimeter_value = new Square(23, 32).same();
console.log("height: 23 width: 32 perimeter: " + perimeter_value);
