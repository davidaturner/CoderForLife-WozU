console.log("Ready!")

interface ingredient {
    item : string;
    costperitem? : number;
    calories? : number;
}

interface sandwich {
    name : string;
    bread : ingredient;
    meat : ingredient;
    cheese : ingredient;
    toppings? : ingredient [];
}

function displayIngredient(i : ingredient) : void {
    console.log("item : " + i.item + 
            " / cost : " + i.costperitem + 
            " / calories : " + i.calories + ".")
}

function displaySandwich(s : sandwich) : void {
    console.log(s.name);
    console.log("Bread : " + s.bread.item);
    console.log("Meat : " + s.meat.item);
    console.log("Cheese : " + s.cheese.item);
    if (s.toppings != undefined) {
        console.log("Toppings : "); 
        var i;
        for(i=0; i<s.toppings.length; i++)    {
            console.log("   " + s.toppings[i].item)
        }   
    }
}

function totalCalories(s : sandwich) : void {
    console.log("Not currently implemented.")
}

function totalCost(s : sandwich) : void {
    console.log("Not currently implemented.")
}



// Test order.
const kosherRyeBread : ingredient = {
    item: "Kosher Rye",
    costperitem : 0.10,
    calories : 120
}

const kosherRyeBreadTuple = ["Kosher Rye", 0.10, 120];

const cornedBeefMeat : ingredient = {
    item: "Corned Beef",
    costperitem : 0.10,
    calories : 120
}

const swissCheese : ingredient = {
    item: "Swiss",
    costperitem : 0.10,
    calories : 120
}

const sauerkrautTopping : ingredient = {
    item: "Sauerkraut",
    costperitem : 0.10,
    calories : 120
}

const thousandIsleTopping : ingredient = {
    item: "Thousand Island Dresing",
    costperitem : 0.10,
    calories : 120
}

const reuben = {} as sandwich;
reuben.name = "Reuben"
reuben.bread = kosherRyeBread;
reuben.meat = cornedBeefMeat;
reuben.cheese = swissCheese;
reuben.toppings = [sauerkrautTopping, thousandIsleTopping];

const reubenOrder = {
    name: "Reuben",
    bread: kosherRyeBread,
    meat: cornedBeefMeat,
    cheese: swissCheese,
    toppings : [sauerkrautTopping, thousandIsleTopping]
} as sandwich;


displayIngredient(kosherRyeBread);
console.log("tuple : " + kosherRyeBreadTuple[0]);
console.log();

// displayIngredient(cornedBeefMeat);
// displayIngredient(swissCheese);
// displayIngredient(sauerkrautTopping);
// displayIngredient(thousandIsleTopping);

displaySandwich(reuben);