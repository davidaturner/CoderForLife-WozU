var ModelS = /** @class */ (function () {
    function ModelS() {
        this.description = "ModelS Type";
        this.cost = 3000;
    }
    return ModelS;
}());
var ModelX = /** @class */ (function () {
    function ModelX() {
        this.description = "ModelX Type";
        this.cost = 3050;
    }
    return ModelX;
}());
var PuddleLightsCarAddOn = /** @class */ (function () {
    function PuddleLightsCarAddOn(theCar) {
        this.theCar = theCar;
        this.description = theCar.description + ", Puddle Lights Option";
        this.cost = theCar.cost + 500;
    }
    return PuddleLightsCarAddOn;
}());
var HeatedSeatsCarAddOn = /** @class */ (function () {
    function HeatedSeatsCarAddOn(theCar) {
        this.theCar = theCar;
        this.description = theCar.description + ", Passenger/Driver Heated Seats Option";
        this.cost = theCar.cost + 700;
    }
    return HeatedSeatsCarAddOn;
}());
var myFirstCar = new ModelS();
console.log(myFirstCar.description);
console.log(myFirstCar.cost);
myFirstCar = new PuddleLightsCarAddOn(myFirstCar);
console.log(myFirstCar.description);
console.log(myFirstCar.cost);
var mySecondCar = new HeatedSeatsCarAddOn(new ModelX());
console.log(mySecondCar.description);
console.log(mySecondCar.cost);
