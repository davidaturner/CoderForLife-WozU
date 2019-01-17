let highSchoolGrade = 11;
let yourGrade;

console.log("Hello from JS");
console.log("");
switch (highSchoolGrade) {
    case 9:
        yourGrade = "Freshman";
        break;
    case 10:
        yourGrade = "Sophomore";
        break;
    case 11:
        yourGrade = "Junior";
        break;
    case 12:
        yourGrade = "Senior";
        break;
    default:
        yourGrade = "Invalid";
        break;
}
console.log("So, for a High School Level of " + highSchoolGrade);
console.log("You would therefore be a " + yourGrade);
console.log("");

console.log("Inserting demo value to Dummy Text.");
console.log("Changing demo value to New text!");
document.getElementById("demo").innerHTML = "New text!";

function name2() {
    let firstName = "Jimbo";
    console.log("Changing demo value again in name2()");
    return firstName === "John" ?
            document.getElementById("demo").innerHTML = "Hello John!" :
            document.getElementById("demo").innerHTML = "Hello Human!";
}

let message = name2();
console.log("");
console.log("DONE!");
