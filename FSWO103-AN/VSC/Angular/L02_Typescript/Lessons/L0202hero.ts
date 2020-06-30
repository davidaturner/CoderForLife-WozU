interface Person {
  name: string;
}
interface Flyable {
  flyheight: number;
}
interface Powers extends Person, Flyable {
  powers: string[];
}

class Superhero implements Powers {
  name: string;
  flyheight: number;
  powers: string[];

  constructor(name: string, flyheight: number, powers: string[]) {
    this.name = name;
    this.flyheight = flyheight;
    this.powers = powers;
  }
}

const frozone = new Superhero("Frozone", 10000, [
  "Freezes any moisture in area",
  "Skates on the frozen ice slide made",
]);
console.log(frozone);
