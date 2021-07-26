interface AnimalInterface {
    name : string;
    whoAmI : string;
    describe() : void;
}

interface BirthMethodInterface {
    birthMethod() : void;
}

interface WingedInterface {
    fly : boolean;
    canFly() : void;
}

class Animal implements AnimalInterface {
    name : string;
    whoAmI : string;
    constructor(name : string, whoAmI : string) {
        this.name = name;
        this.whoAmI = whoAmI;
    }

    describe() : void {
        describe(this.name, this.whoAmI);
    }
}

function describe(name : string, whoAmI : string) : void {
    console.log("Hi, my name is " + name + ". I am a(n) " + whoAmI + ".");
}

const DONT_KNOW : string = "I don't know how I am born.";
const LIVE_BORN : string = "I am live born.";

class Mammal implements AnimalInterface, BirthMethodInterface {
    name : string;
    whoAmI : string;
    constructor(name : string, whoAmI : string) {
        this.name = name;
        this.whoAmI = whoAmI;
    }

    describe() : void {
        describe(this.name, this.whoAmI);
        console.log(this.birthMethod());
    }

    birthMethod() :string {
        return LIVE_BORN;
    }
}

class Bat implements AnimalInterface, BirthMethodInterface, WingedInterface {
    name : string;
    whoAmI : string;
    fly : boolean = false;
    constructor(name : string, whoAmI : string, canFly : boolean) {
        this.name = name;
        this.whoAmI = whoAmI;
        this.fly = canFly;
    }

    describe() : void {
        describe(this.name, this.whoAmI);
        console.log(this.birthMethod());
        this.canFly();
    }

    birthMethod() :string {
        return LIVE_BORN;
    }

    canFly() : void {
        console.log((this.fly)?"And, I can fly.":"And, um, I cannot fly.");
    }
}

const animal = new Animal("Toby", "Duck");
animal.describe();

console.log();

const mammal = new Mammal("Goofy", "Dawg");
mammal.describe();

console.log();

const bat = new Bat("Drac", "Vampire Bat", true);
bat.describe();