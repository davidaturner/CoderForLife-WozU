interface Shape {
  sides: number;
}
interface Triangle extends Shape {
  angles: number[];
}

class Equilateral implements Triangle {
  sides: number;
  angles: number[];
  constructor(sides: number, angles: number[]) {
    this.sides = sides;
    this.angles = angles;
  }
}

const triangle = new Equilateral(3, [60, 60, 60]);
console.log(triangle);

// But what if you don't want to create an new class? You just
// want to use the interfaces (blueprints) to create an instance?
const myShape = {} as Triangle;
myShape.sides = 3;
myShape.angles = [60, 60, 60];

console.log(myShape);
