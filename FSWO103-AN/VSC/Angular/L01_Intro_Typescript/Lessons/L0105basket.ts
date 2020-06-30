interface IngredientsBasket {
  numberOfItems: number;
  ingredients: string[];
  calories?: number; // optional
}

function makeMeASandwich(basket: IngredientsBasket): void {
  let msg: string =
    "Your sandwich includes " +
    basket.numberOfItems +
    " items of " +
    basket.ingredients;
  let msgend: string = ".";
  let msgopt: string =
    ", which comes out to be a total of " + basket.calories + " calories.";

  if (basket.calories != null) {
    console.log(msg + msgopt);
  } else {
    console.log(msg + msgend);
  }
}

const sandwichBasket = {} as IngredientsBasket;

sandwichBasket.numberOfItems = 3;
sandwichBasket.ingredients = ["bacon", "lettuce", "tomato"];
sandwichBasket.calories = 320;

//makeMeASandwich(sandwichBasket);

const hamAndCheeseBasket = {
  numberOfItems: 2,
  ingredients: ["Ham", "Cheese"],
};

makeMeASandwich(hamAndCheeseBasket);
