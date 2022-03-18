/*
Property Decorators: Property decorators are similar to method decorators, but they 
only require two parameters:
    target: The prototype of the class.
    propertyKey: The name (string) of the method being decorated.

Class Decorators: Class decorators allow you to modify the constructor of a class 
by either changing or adding new properties and methods to the class in question. 
Class decorators only require one parameter:
    target: The prototype of the class.
*/

// 1. Class decorator
function InspectClass(target: any) {
    console.log(`Class in use: ${target.name}`);
}

// 2a. Property decorator
function InspectProperty(target: any, propertyKey: string): void {
    let val = target[propertyKey];

    // 2b. this runs when a property is read
    let getter = function() {
        console.log(`Get: ${propertyKey} => ${val}`);
        return val;
    };

    // this runs when a property's value is set
    let setter = function(newValue: any) {
        console.log(`Set: ${propertyKey} => ${newValue}`);
        val = newValue;
    };

    // 2c. below, the `delete` removes the property from the class
    // then with your Object.defineProperty() function, you are
    // re-adding the property with a new getter and setter.
    if (delete target[propertyKey]) {
        Object.defineProperty(target, propertyKey, {
            get: getter,
            set: setter
        });
    }
}

// 3a. `Automobile` class uses `InspectClass` class decorator
@InspectClass
class Automobile {
    // 3b. the `make` property uses the `InspectProperty` property decorator
    @InspectProperty
    public make: string;
    // the other two properties are not using a decorator
    public model: string;
    public year: number;

    constructor(make: string, model: string, year: number) {
        // 3c. when an instance of `Automobile` is created, its properties
        // will get set, so the decorator for the `make` property
        // will result in information getting logged to the console
        this.make = make;
        // the next two properties do not have decorators
        this.model = model;
        this.year = year;
    }

    // 3d. this method accesses the properties, of which `make` is decorated
    // so when `getInfo()` is called, it will result in information
    // getting logged to the console about `make`
    getInfo(): string {
        return `Make: ${this.make}  Model: ${this.model}  Year: ${this.year}`
    }
}

let mazda = new Automobile("Mazda", "RX-8", 2003);
console.log(mazda.getInfo());