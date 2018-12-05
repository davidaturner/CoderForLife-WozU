let age = 16;

function allowedIntoMovie() {
    if (age < 0) {
        console.log("Age " + age + " is invalid.");
    }
    else if (age >= 0 && age < 10) {
        console.log("Not permitted");
    }
    else if (age < 15) {
        console.log("Permitted with parent");
    }
    else if (age < 18) {
        console.log("Permitted with anyone over 18");
    }
    else {
        console.log("Permitted to attend alone.");
    }
}

allowedIntoMovie();