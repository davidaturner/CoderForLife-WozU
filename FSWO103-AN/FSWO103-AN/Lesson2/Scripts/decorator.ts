interface ICar {

    description: string;
    cost: number;
}

class ModelS implements ICar {
    description: string;
    cost: number;

    constructor() {
        this.description = "ModelS Type"
        this.cost = 3000;
    }
}

class ModelX implements ICar {

    public description: string;
    public cost: number;

    constructor() {
        this.description = "ModelX Type"
        this.cost = 3050;
    }
}

interface ICarAddOnDecorator extends ICar {
    theCar: ICar;

    description: string;
    cost: number;
}

class PuddleLightsCarAddOn implements ICarAddOnDecorator {
    theCar: ICar;

    description: string;
    cost: number;

    constructor(theCar) {
        this.theCar = theCar;

        this.description = theCar.description + ", Puddle Lights Option"
        this.cost = theCar.cost + 500;
    }
}

class HeatedSeatsCarAddOn implements ICarAddOnDecorator {
    theCar: ICar;

    description: string;
    cost: number;

    constructor(theCar) {
        this.theCar = theCar;

        this.description = theCar.description + ", Passenger/Driver Heated Seats Option"
        this.cost = theCar.cost + 700;
    }
}

let myFirstCar = new ModelS();
console.log(myFirstCar.description);
console.log(myFirstCar.cost);

myFirstCar = new PuddleLightsCarAddOn(myFirstCar);
console.log(myFirstCar.description);
console.log(myFirstCar.cost);

let mySecondCar = new HeatedSeatsCarAddOn(new ModelX());
console.log(mySecondCar.description);
console.log(mySecondCar.cost);
