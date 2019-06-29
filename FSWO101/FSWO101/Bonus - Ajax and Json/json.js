// JSON examples 1,2,3
var myCat = {
    "name": "mewosalot",
    "species": "cat",
    "favoriteFood": "tuna"
};

console.log(myCat.name + " is a " + myCat.species + " who digs eating " + myCat.favoriteFood);

var myColors = ["blue", "green", "red", "yellow"];

console.log(myColors[1]);

var myPets = [
    {
        "name": "mewsosalot",
        "species": "cat",
        "favoriteFood": "tuna"
    },
    {
        "name": "beard",
        "species": "dog",
        "favoriteFood": "steak"
    },
    {
        "name": "karrle",
        "species": "ferret",
        "favoriteFood": "cat food"
    }
];

// Show array value.
console.log(myPets[1].name + " is a " + myPets[1].species + " who digs eating " + myPets[1].favoriteFood);

// Assign array value to myPet.
var myPet = myPets[2];
console.log(myPet.name + " is a " + myPet.species + " who digs eating " + myPet.favoriteFood);

// forEach using anonymous function.
myPets.forEach(function (pet) {

    console.log(pet.species);
});

// forEach using arrow function.
myPets.forEach((pet) => {

    console.log(pet.name);
});

// Examples of JSON on URL
// ttps://learnwebcode.github.io/json-example/animals-1.json
// ttps://learnwebcode.github.io/json-example/animals-2.json
// ttps://learnwebcode.github.io/json-example/animals-3.json

// Loading JSON
var ourRequest = new XMLHttpRequest();
ourRequest.open('GET', "https://learnwebcode.github.io/json-example/animals-1.json");

ourRequest.onload =  function() {
    //console.log(ourRequest.responseText);
    var ourData = JSON.parse(ourRequest.responseText);
    console.log(ourData[0]);
};
ourRequest.send();


