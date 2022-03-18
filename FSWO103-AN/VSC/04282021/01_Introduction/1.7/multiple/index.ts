interface Animal {
    name: string;
    whoAmI(): void;
}

interface Mammal {
    brushHair(): void;
}

interface WingedAnimal {
    fly(): void;
}

class Bat implements Animal, Mammal, WingedAnimal {
    name: string;

    constructor(name: string) {
        this.name = name
    }

    whoAmI(): void {
        console.log("I'm " + this.name + "!");
    }

    brushHair(): void {
        console.log("I must brush my hair to look pretty!");
    }

    fly(): void {
        console.log("Look! I can fly!");
    }
}

let bat = new Bat("Bartok");
bat.whoAmI();
bat.brushHair();
bat.fly();