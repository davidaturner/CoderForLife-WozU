console.log("Ready!");

interface ingredientsBasketType01 {
    numberOfItems : number;
    ingredients : string[];
    calories : number;
}

// make calories optional
interface ingredientsBasketType02 {
    numberOfItems : number;
    ingredients : string[];
    calories? : number;
}

// make numberOfItems readonly
interface ingredientsBasketType03 {
    readonly numberOfItems : number;
    ingredients : string[];
    calories? : number;
}

function makeSandwich(sandwich : ingredientsBasketType01) : void {
    console.log("Your sandwich includes " + sandwich.numberOfItems + " ingredients," );
    console.log("" + sandwich.ingredients + 
                ", for a total of " + sandwich.calories + " calories.");
}

const BLT : ingredientsBasketType01 = {
    numberOfItems : 3,
    ingredients : ["Bacon", "Lettuce", "Tomato"],
    calories : 320
}

makeSandwich(BLT);