class Rectangle {
    height: number;
    width: number;
    // Can only have one constructor.
    constructor(height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    perimeter() {
        return this.height * 2 + this.width * 2;
    }
}

const rectangle: Rectangle = new Rectangle(2, 3);
console.log("The perimeter of a rectangle with sides " + rectangle. height + 
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