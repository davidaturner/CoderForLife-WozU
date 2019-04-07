

var highSchoolGrade = 10;
var yourGrade;
var firstName = "John";

function updateGrade(){

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
}

function name() {
    console.log("Inserting demo value to Dummy Text.");
    console.log("Changing demo value to New textA!");
    document.getElementById("demo").innerHTML = "New textA!";

//  let firstName;

  (firstName === "John") ?
            document.getElementById("demo").innerHTML = "Hello John!" :
            document.getElementById("demo").innerHTML = "Hello Human!";
}

/*
function upgradeGrade2() {
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
}

function name2() {

    console.log("Inserting demo value to Dummy Text.");
    console.log("Changing demo value to New text!");
    document.getElementById("demo").innerHTML = "New text!";

    console.log("Changing demo value again in name2()");
    (firstName === "John") ?
            document.getElementById("demo").innerHTML = "Hello John!" :
            document.getElementById("demo").innerHTML = "Hello Human!";
}
*/
updateGrade();
name();
