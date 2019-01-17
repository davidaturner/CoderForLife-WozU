let age;

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

console.log("Hello from JS");
console.log("");
age = 17;
console.log("Permission when Age: " + age);
allowedIntoMovie();
age = 14;
console.log("Permission when Age: " + age);
allowedIntoMovie();
age = 15;
console.log("Permission when Age: " + age);
allowedIntoMovie();
age = 18;
console.log("Permission when Age: " + age);
allowedIntoMovie();
age = 44;
console.log("Permission when Age: " + age);
allowedIntoMovie();
age = 12;
console.log("Permission when Age: " + age);
allowedIntoMovie();
age = 8;
console.log("Permission when Age: " + age);
allowedIntoMovie();
console.log("");
console.log("DONE!");