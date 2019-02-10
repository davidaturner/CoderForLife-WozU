/* 
 * Need export so that js script will be treated
 * as a module... not a script. 
 * */
export { }
let message = "Hello, my World!"
console.log(message);

let x = 10;
const y = 20;

let z: boolean = true;
let a: number = 25;
let b: string = "Lopey";
let c: string;

let sentence: string = 'Hi, my name is %s';
console.log(sentence, b);
console.log("This is %cMy delishness message", "color: yellow; font-style: italic; background-color: blue;padding: 2px");

/* Tuples */
/* An array of multiple types. */
/* Fixed elements. Fixed order. */
let person: [string, number] = ["Chris", 22];
console.log(person);

enum Color { "Red", "Blue", "Green" };
let frob: Color = Color.Green; /* Green = 2 */
console.log(frob);
