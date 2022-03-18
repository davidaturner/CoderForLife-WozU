"use strict";
function makeASandwich(ingredients) {
    console.log('Your sandwich includes ' +
        ingredients.numberOfItems + " " +
        'items: ' +
        ingredients.ingredients[0] + ", " +
        ingredients.ingredients[1] + ", " +
        ingredients.ingredients[2] + ", " +
        'which comes out to be a total of ' +
        ingredients.calories + " " +
        'calories.');
}
var sandwichIngredients = {
    numberOfItems: 3,
    ingredients: ['bacon', 'lettuce', 'tomato'],
    calories: 320
};
makeASandwich(sandwichIngredients);
/*
interface ingredientsBasket {
    readonly numberOfItems: number;
    ingredients: string[];
    calories?: number;
}

let club: ingredientsBasket = {
    numberOfItems: 3,
    ingredients: ['Turkey', 'Ham', 'Bacon']
};

club.numberOfItems = 'My Favorite'; // This will throw an error.
*/ 
