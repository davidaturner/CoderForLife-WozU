// console.log("Hello World from JS");

var counter = 1;
var animal_info = document.getElementById('animalinfo');
var btn = document.getElementById('btn');

btn.addEventListener("click", function () {

    var ourRequest = new XMLHttpRequest();
    // Vary the URL to get JSON data.
    // ourRequest.open('GET', "ttps://learnwebcode.github.io/json-example/animals-1.json");
    ourRequest.open('GET', "https://learnwebcode.github.io/json-example/animals-" + counter +".json");

    ourRequest.onload = function () {

        // Set up error handling.
        //console.log(ourRequest.responseText);
        if (ourRequest.status >= 200 && ourRequest.status < 400) {

            var ourData = JSON.parse(ourRequest.responseText);
            renderHTML(ourData);
        }
        else {
            alert('Error retrieving the data.');
        }

    };

    // Set up error handling.
    ourRequest.onerror = function () {
        alert('Connection error.')
    };

    ourRequest.send();
    counter++;
    if (counter > 3) {
        btn.classList.add("hide");
    }
});

// A better way to render HTML might be handlebarsjs
function renderHTML(data) {
    
    var htmlstr = "";
    for (i = 0; i < data.length; i++) {
        htmlstr += "<p>" + data[i].name + " is a " + data[i].species + " that likes eating ";
        for (j = 0; j < data[i].foods.likes.length; j++) {
            if (j < data[i].foods.likes.length - 1) {
                htmlstr += data[i].foods.likes[j] + " and ";
            }
            else {
                htmlstr += data[i].foods.likes[j];
            }
        }
        htmlstr += " and dislikes ";
        for (j = 0; j < data[i].foods.dislikes.length; j++) {
            if (j < data[i].foods.dislikes.length - 1) {
                htmlstr += data[i].foods.dislikes[j] + " and ";
            }
            else {
                htmlstr += data[i].foods.dislikes[j];
            }
        }
        htmlstr += ".</p>";
    }
    animal_info.insertAdjacentHTML('beforeend', htmlstr);
}
