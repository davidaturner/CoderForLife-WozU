"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var message = "Hello, my World!";
console.log(message);
var x = 10;
var y = 20;
var z = true;
var a = 25;
var b = "Lopey";
var c;
var sentence = 'Hi, my name is %s';
console.log(sentence, b);
console.log("This is %cMy delishness message", "color: yellow; font-style: italic; background-color: blue;padding: 2px");
/* Tuples */
/* An array of multiple types. */
/* Fixed elements. Fixed order. */
var person = ["Chris", 22];
console.log(person);
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Blue"] = 1] = "Blue";
    Color[Color["Green"] = 2] = "Green";
})(Color || (Color = {}));
;
var frob = Color.Green; /* Green = 2 */
console.log(frob);
//# sourceMappingURL=main.js.map