class Rectangle {
    height: number;
    width: number;
    constructor(height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    perimeter() {
        return this.height * 2 + this.width * 2;
    }
}

class Square extends Rectangle {
    area() {
        return this.height * this.width;
    }
}

const newSquare = new Square(3, 5);
const area = newSquare.area();
const perimeter = newSquare.perimeter();

console.log("Area: " + area + " Perimeter: " + perimeter);