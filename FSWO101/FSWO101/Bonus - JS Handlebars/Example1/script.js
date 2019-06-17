var lannisters = {

    "characters": [
        {
            "name": "Cersei Lannister",
            "photo": "lena-headey-game-of-thrones-062016",
            "actor": "Lena Headey",
            "house": "Lannister",
            "location" : "unknown"
        },
        {
            "name": "Jamie Lannister",
            "photo": "nikolaj-coster-waldau-game-of-thrones-062116",
            "actor": "Nikolaj Coster Waldau",
            "house": "Lannister",
            "location": "unknown"
        },
        {
            "name": "Tyrion Lannister",
            "photo": "peter-dinklage-game-of-thrones-062016",
            "actor": "Peter Dinklage",
            "house": "Lannister",
            "location": "unknown"
        },
        {
            "name": "Tywin Lannister",
            "photo": "Tywin_Lannister_1024x1024",
            "actor": "Charles Dance",
            "house": "Lannister",
            "location": "unknown"
        }
    ]
};

$(document).ready(function () {

    var characterTemplate = $("#character-template").html();
    var compiledCharacters = Handlebars.compile(characterTemplate);
    // Example testing
 //  console.log(compiledCharacters({ "name": "Cersei Lannister" }));
 //   console.log(compiledCharacters({ name: "Cersei", actor: "Lena Headey"}));
//    console.log(compiledCharacters(lannisters.characters[0]));
//    console.log(compiledCharacters(lannisters.characters[0]));
//    $("#character-list-container").html(compiledCharacters(lannisters.characters[1]));
    $("#character-list-container").html(compiledCharacters(lannisters));

});
