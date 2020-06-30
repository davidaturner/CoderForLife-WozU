class Rectangle {
  private static height: number;
  private static width: number;
  constructor(height: number, width: number) {
    Rectangle.height = height;
    Rectangle.width = width;
  }
  public getHeight(): number {
    return Rectangle.height;
  }
  public getWidth(): number {
    return Rectangle.width;
  }
  perimeter(): number {
    return Rectangle.height * 2 + Rectangle.width * 2;
  }
  area(): number {
    return Rectangle.height * Rectangle.width;
  }
}
const rectangle = new Rectangle(2, 15);
console.log(rectangle.perimeter());

class Square extends Rectangle {
  constructor(height: number) {
    super(height, height);
  }
}

const square = new Square(12);
console.log(square);
console.log(square.getHeight());
console.log(square.perimeter());
console.log(square.area());
