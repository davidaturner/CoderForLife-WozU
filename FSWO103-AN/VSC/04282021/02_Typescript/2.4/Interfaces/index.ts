interface Person {
    name: string;
}

interface Flyable {
    flyHeight: number;
}

/* When extending interfaces do not add
the variables specified by the other interfaces */
interface Powers extends Person, Flyable {
    powers: string[];
}

class SuperHero implements Powers {
    name: string;
    flyHeight: number;
    powers: string[];

    constructor(firstName: string, flyingheight: number, powersList: string[]){
        this.name = firstName;
        this.flyHeight = flyingheight;
        this.powers = powersList;
    }
}

const frozone = new SuperHero('Frozone', 10000, ['Freeze water from any moisture', 'Ice Skate on his frozen water'])

console.log(frozone)