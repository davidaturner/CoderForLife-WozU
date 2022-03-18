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

const myYard = new Rectangle(24, 32);
console.log(myYard);
console.log(myYard.perimeter())

const myYard2Perimeter : number = new Rectangle(1, 2).perimeter();
console.log(myYard2Perimeter);