// Class declaration. Main advantage is reuse.
class RectangleTypeA {
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

const rectangleA = new RectangleTypeA(2, 12);
console.log(rectangleA.perimeter());

// Un named class expression. Main advantage is
// you do not plan to reuse classname internally nor
// externally.
const rectangleB = class {
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

const irectb = new rectangleB(2, 13);
console.log(irectb.perimeter());

// Named class expression. Main advantage is you can
// call the class Internally but not externally.
const rectangleC = class RectangleTypeC {
  height: number;
  width: number;
  constructor(height: number, width: number) {
    this.height = height;
    this.width = width;
  }
  static setDefaultHeight(): number {
    return 5;
  }
  static setDefaultWidth(): number {
    return 10;
  }
  perimeter() {
    if (this.height == 0) {
      this.height = RectangleTypeC.setDefaultHeight();
    }
    if (this.width == 0) {
      this.width = RectangleTypeC.setDefaultWidth();
    }

    return this.height * 2 + this.width * 2;
  }
};

const irectc = new rectangleC(15, 0); // Default width
console.log(irectc.perimeter());
