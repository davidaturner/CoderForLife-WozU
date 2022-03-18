
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

class Rectangle {
    height: number;
    width: number;
    constructor(height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    protected perimeter() {
        return this.height * 2 + this.width * 2;
    }
}

class Square extends Rectangle {
    // Can access perimeter() method BUT only within Square.
    same() {
        return this.perimeter();
    }

    area() {
        return this.height * this.width;
    }
}

const square = new Square(23, 32);
// const perimeter_value = new Square(23, 32).perimeter(); // Cannot access directly.
const perimeter_value = new Square(23, 32).same(); 
console.log("height: 23 width: 32 perimeter: " + perimeter_value);
