/* Solution: Create a class. 

interface Shape {
    sides: number;
}

interface Triangle extends Shape {
    angles: number[];
}

class Equilateral implements Triangle {
    sides: number;
    angles: number[];

    constructor(numberOfSides: number, anglesNumbers: number[]){
        this.sides = numberOfSides;
        this.angles = anglesNumbers;
    }
}

const triangle = new Equilateral(3, [60, 60, 60])
console.log(triangle)
*/
/*
    Alternative solution.
    No need to create a class.
    Use the interface to instantiate!!
*/
interface Shape {
    sides: number;
}

interface Triangle extends Shape {
    angles: number[];
}

let equilateral = <Triangle>{};
equilateral.sides = 3;
equilateral.angles = [60, 60, 60];

console.log(equilateral);