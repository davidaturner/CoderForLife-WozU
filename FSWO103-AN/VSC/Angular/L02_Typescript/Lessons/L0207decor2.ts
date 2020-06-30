// Property decorators are similar to method decorators except that they
// require only two arguments.
// target: Object - the prototype of the class.
// propertyKey: string - the name/string of the method being decorated.
function inspectProperty(target: any, propertyKey: string) {
  let val = target[propertyKey];

  let getter = function () {
    console.log(`Get: ${propertyKey} => ${val}`);
    return val;
  };
  let setter = function (newValue: any) {
    console.log(`Set: ${propertyKey} => ${newValue}`);
    val = newValue;
  };
  // the delete removes the property from the class.
  // defineProperty then re-adds the getter and setter properties.
  if (delete target[propertyKey]) {
    Object.defineProperty(target, propertyKey, {
      get: getter,
      set: setter,
    });
  }
}

// Class decorators allow you to modify the constructor of a class by either
// changing or adding new properties and methods to the class in question.
// Requires only one argument.
// target: Object = the prototype of the class.
function inspectClass(target: any) {
  console.log(`Class in use: ${target.name}`);
}

// Set decorator to Automobile. And call. Yeah. when DECLARED, not instantiated.
@inspectClass
class Automobile {
  // Set decorator on property - make.
  @inspectProperty
  public make: string;

  public model: string;
  public year: number;

  constructor(make: string, model: string, year: number) {
    // Call decorated setter - make
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo(): string {
    // Call decorated getter - make.
    return `Make: ${this.make} Model: ${this.model} Year: ${this.year}`;
  }
}

console.log("Creating an instance of Automobile...");
let mazda = new Automobile("Mazda", "RX-8", 2003);
console.log("Now getting its info...");
console.log(mazda.getInfo());
