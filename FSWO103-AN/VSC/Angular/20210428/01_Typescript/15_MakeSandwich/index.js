"use strict";
console.log("Ready!");
function displayIngredient(i) {
    console.log("item : " + i.item +
        " / cost : " + i.costperitem +
        " / calories : " + i.calories + ".");
}
function displaySandwich(s) {
    console.log(s.name);
    console.log("Bread : " + s.bread.item);
    console.log("Meat : " + s.meat.item);
    console.log("Cheese : " + s.cheese.item);
    if (s.toppings != undefined) {
        console.log("Toppings : ");
        var i;
        for (i = 0; i < s.toppings.length; i++) {
            console.log("   " + s.toppings[i].item);
        }
    }
}
function totalCalories(s) {
    console.log("Not currently implemented.");
}
function totalCost(s) {
    console.log("Not currently implemented.");
}
// Test order.
var kosherRyeBread = {
    item: "Kosher Rye",
    costperitem: 0.10,
    calories: 120
};
var kosherRyeBreadTuple = ["Kosher Rye", 0.10, 120];
var cornedBeefMeat = {
    item: "Corned Beef",
    costperitem: 0.10,
    calories: 120
};
var swissCheese = {
    item: "Swiss",
    costperitem: 0.10,
    calories: 120
};
var sauerkrautTopping = {
    item: "Sauerkraut",
    costperitem: 0.10,
    calories: 120
};
var thousandIsleTopping = {
    item: "Thousand Island Dresing",
    costperitem: 0.10,
    calories: 120
};
var reuben = {};
reuben.name = "Reuben";
reuben.bread = kosherRyeBread;
reuben.meat = cornedBeefMeat;
reuben.cheese = swissCheese;
reuben.toppings = [sauerkrautTopping, thousandIsleTopping];
var reubenOrder = {
    name: "Reuben",
    bread: kosherRyeBread,
    meat: cornedBeefMeat,
    cheese: swissCheese,
    toppings: [sauerkrautTopping, thousandIsleTopping]
};
displayIngredient(kosherRyeBread);
console.log("tuple : " + kosherRyeBreadTuple[0]);
console.log();
// displayIngredient(cornedBeefMeat);
// displayIngredient(swissCheese);
// displayIngredient(sauerkrautTopping);
// displayIngredient(thousandIsleTopping);
displaySandwich(reuben);
