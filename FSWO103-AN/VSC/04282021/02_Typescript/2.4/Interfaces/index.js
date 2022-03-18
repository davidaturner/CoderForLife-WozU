"use strict";
var SuperHero = /** @class */ (function () {
    function SuperHero(firstName, flyingheight, powersList) {
        this.name = firstName;
        this.flyHeight = flyingheight;
        this.powers = powersList;
    }
    return SuperHero;
}());
var frozone = new SuperHero('Frozone', 10000, ['Freeze water from any moisture', 'Ice Skate on his frozen water']);
console.log(frozone);
