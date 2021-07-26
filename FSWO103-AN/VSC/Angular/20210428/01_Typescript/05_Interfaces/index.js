"use strict";
console.log("Ready!");
function makeSandwich(sandwich) {
    console.log("Your sandwich includes " + sandwich.numberOfItems + " ingredients,");
    console.log("" + sandwich.ingredients +
        ", for a total of " + sandwich.calories + " calories.");
}
var BLT = {
    numberOfItems: 3,
    ingredients: ["Bacon", "Lettuce", "Tomato"],
    calories: 320
};
makeSandwich(BLT);
